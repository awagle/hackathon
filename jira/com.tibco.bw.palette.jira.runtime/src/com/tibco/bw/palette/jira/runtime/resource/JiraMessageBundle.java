/**
 * 
 */
package com.tibco.bw.palette.jira.runtime.resource;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import com.tibco.neo.localized.BundleMessage;
import com.tibco.neo.localized.LocalizedMessage;
import com.tibco.neo.localized.MessageBundle;

/**
 * @author hnembhwa
 *
 */
public class JiraMessageBundle extends MessageBundle {

	public static final String BUNDLE_NAME = JiraMessageBundle.class.getPackage().getName() + ".MessageCode"; 
	public static final String PLUGIN_PROPERTIES_FILE_NAME = JiraMessageBundle.class.getPackage().getName() + ".PluginConfig";
	private static final Map<Integer,BundleMessage> bundleMessageMap = new HashMap<Integer,BundleMessage>();

    static {
    	MessageBundle.initializeMessages(JiraMessageBundle.class);
    	initializeBundleMessageMap();
    }
    
    public static String getLocalMessage(BundleMessage bundleId, String...args){
        return new LocalizedMessage(bundleId,args).getLocalizedMessage();
    }
    
    public static BundleMessage getBundleMessage(String errorCode){
    	return bundleMessageMap.get(Integer.parseInt(errorCode));
    }
    
    public static String getRole(String errorCode){
    	ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault(), JiraMessageBundle.class.getClassLoader());
    	return resourceBundle.getString(errorCode);
    }
    
    private static void initializeBundleMessageMap(){
    	Class<JiraMessageBundle> clazz = JiraMessageBundle.class;
    	Field fields[] = clazz.getDeclaredFields();
        int numFields = fields.length;
        for(int i = 0; i < numFields; i++)
        {
            Field field = fields[i];
            if(BundleMessage.class.isAssignableFrom(field.getType()) && (field.getModifiers() & 25) == 9) {
				try
                {
                    if(field.get(null) != null)
                    {
                    	BundleMessage bundleMessage = (BundleMessage)field.get(null);
                    	int errorCode = bundleMessage.getErrorCode();
                    	if(errorCode==-1){
                    		System.err.println("the BundleMessage "+bundleMessage.getMessageKey()+" does not have a correct errorCode");
                    		continue;
                    	}
                    	bundleMessageMap.put(errorCode, bundleMessage);
                    }
                }
                catch(IllegalAccessException _ex) { }
			}
        }
    }
    
    public static void main(String[] args) {
    	initializeBundleMessageMap();
    	for(Integer code : bundleMessageMap.keySet()){
    	}
    }
    
    public static BundleMessage ANONYMOUS_COMPLEX_TYPE_ERROR;
    public static BundleMessage ACCEPT_HEADER_MISSING;
    public static BundleMessage CONTENT_TYPE_MISSING;
    public static BundleMessage INVALID_AUTH_CONFIG;
    
}
