package com.tibco.bw.palette.jira.runtime;

import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.apache.http.HttpException;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.genxdm.Model;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.uri.UriComponent;

import com.tibco.bw.palette.jira.model.jiraPalette.Query;
import com.tibco.bw.palette.jira.runtime.resource.JiraMessageBundle;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.bw.sharedresource.http.client.runtime.HTTPClientDriverFactory;
import com.tibco.bw.sharedresource.runtime.ResourceReference;
import com.tibco.bw.sharedresource.trinity.identity.subject.runtime.SubjectResource;
import com.tibco.neo.localized.LocalizedMessage;
import com.tibco.plugin.jira.JiraPluginConstants;
import com.tibco.plugin.jira.Logger;
import com.tibco.plugin.jira.MessageCode;

/**
 * @author hnembhwa
 *
 */
public class JiraQueryActivity<N> extends SyncActivity<N>  {

	@Property(name="connection")
	public HTTPClientDriverFactory driverFactory;
	
	@Property
	public Query model;
	
	WebTarget resource;
	
	private Client client;
	URI url; 
	
	private static final ArrayList<Class> httpCommunicationExceptions = new ArrayList<Class>();
	
	@Override
	public void init() throws ActivityLifecycleFault {
		super.init();
		try{
			initHttpCommunicationExceptions();
			String host = driverFactory.getClientConfiguration().getHost();
			int port = driverFactory.getClientConfiguration().getPort();
			String resourcePath = "/rest/api/2/search";
			url = new URI(driverFactory.getClientConfiguration().getScheme() + "://" + host+ ":" + port + resourcePath);
			
			ClientConfig config = new ClientConfig();
			config.property(ApacheClientProperties.CONNECTION_MANAGER, driverFactory.getHttpComponentsConnectionManager());
			
			if(driverFactory.getClientConfiguration().isAuthEnabled()){
				ResourceReference reference = driverFactory.getClientConfiguration().getIdentityResource();
				 if(reference != null){
					 SubjectResource resource = (SubjectResource)reference.getResource();
					 String username = resource.getUserName();
					 String password = resource.getUserPassword();
					 CredentialsProvider credsProvider = null;
					 if(username != null && password != null && !username.isEmpty() && !password.isEmpty()){
						 credsProvider = new BasicCredentialsProvider();
				            credsProvider.setCredentials(new AuthScope(host,port), new UsernamePasswordCredentials(username, password));
						 
					 } else {
						 throw new ActivityLifecycleFault(new LocalizedMessage(JiraMessageBundle.INVALID_AUTH_CONFIG));
					 }
					 if(credsProvider != null){
						 config.property(ApacheClientProperties.CREDENTIALS_PROVIDER, credsProvider);
						 config.property(ApacheClientProperties.PREEMPTIVE_BASIC_AUTHENTICATION, true);
					 }
				 }
			}
			
			long connectionTimeout = driverFactory.getClientConfiguration().getConnectionTimeout();
			config.property(ClientProperties.CONNECT_TIMEOUT, new Long(connectionTimeout).intValue());
			
			int readTimeout = driverFactory.getClientConfiguration().getSoTimeout();
			config.property(ClientProperties.READ_TIMEOUT, readTimeout);
			
			config.connectorProvider(new ApacheConnectorProvider());
			client = JerseyClientBuilder.createClient(config);
			resource = client.target(url);
			
		}catch (Exception e) {
			throw new ActivityLifecycleFault(e);
		}
	}

	@Override
	public N execute(N input, ProcessContext<N> context) throws ActivityFault {
		Logger.setLogger(this.activityLogger);
		try{
			this.activityLogger.debug("start eval() of JIRA Query Activity");
			Model<N> xmlModel = getActivityContext().getXMLProcessingContext().getMutableContext().getModel();
			N jqlNode = xmlModel.getFirstChildElementByName(input, "", "jql");
			String jql = xmlModel.getStringValue(jqlNode);
//			resource = resource.queryParam("maxResults", 2);
			resource = resource.queryParam("jql", UriComponent.encode(jql, UriComponent.Type.QUERY_PARAM_SPACE_ENCODED));
			this.activityLogger.debug("Resource is *** " + resource);
			Invocation.Builder builder = resource.request();
			
			try{
				Response rs = builder.get(Response.class);
				String response = rs.readEntity(String.class);
				this.activityLogger.debug("Response received is $$$$" + response);
			} catch(Exception e){
				e.printStackTrace();
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	@Property
	public Query activityConfig;

	private void initHttpCommunicationExceptions(){
		httpCommunicationExceptions.add(SocketTimeoutException.class);
		httpCommunicationExceptions.add(HttpException.class);
	}
	
}
