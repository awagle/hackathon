/**
 * 
 */
package com.tibco.bw.palette.jira.runtime;

import com.tibco.bw.palette.jira.model.jiraPalette.Query;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.annotation.Property;

/**
 * @author hnembhwa
 *
 */
public class JiraQueryActivity<N> extends SyncActivity<N>  {


	@Override
	public N execute(N arg0, ProcessContext<N> arg1) throws ActivityFault {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Property
	public Query activityConfig;

}
