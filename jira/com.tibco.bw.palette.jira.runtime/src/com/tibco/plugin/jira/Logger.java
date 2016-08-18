/**
 * 
 */
package com.tibco.plugin.jira;

import com.tibco.bw.palette.jira.runtime.resource.JiraMessageBundle;
import com.tibco.bw.runtime.ActivityLogger;
import com.tibco.neo.localized.BundleMessage;
import com.tibco.plugin.jira.util.PrintLogger;

/**
 * @author hnembhwa
 *
 */
public class Logger {

	private static final PrintLogger printLogger = new PrintLogger();

	private static ThreadLocal<ActivityLogger> logger = new ThreadLocal<ActivityLogger>();

	public static void setLogger(ActivityLogger activityLogger) {
		logger.set(activityLogger);
	}

	public static void removeLogger() {
		logger.remove();
	}
	
	public static void trace(String code, String... params) {
		String errorCode = getBW6ErrorCode(code);
		BundleMessage bundleMessage = JiraMessageBundle.getBundleMessage(errorCode);
		if (bundleMessage == null)
			throw new RuntimeException("no bundleMessage found for " + errorCode);
		
		String role = JiraMessageBundle.getRole(errorCode);
		
		ActivityLogger currentLogger = logger.get();
		if (currentLogger == null) {
			printLog(role, bundleMessage, params);
		} else {
			// throw new RuntimeException("No ActivityLogger set in this thread");
			if ("infoRole".equals(role)) {
				currentLogger.info(bundleMessage, params);
			} else if ("errorRole".equals(role)) {
				currentLogger.error(bundleMessage, params);
			} else if ("warnRole".equals(role)) {
				currentLogger.warn(bundleMessage, params);
			} else if ("debugRole".equals(role)) {
				currentLogger.debug(bundleMessage, params);
			} else {
				throw new RuntimeException("No related role for " + errorCode);
			}
		}

	}
	
	private static String getBW6ErrorCode(String bw6Code) {
		String bw6ErrorCode = bw6Code.split("BW-JIRA-")[1];
		return bw6ErrorCode;
	}
	
	private static void printLog(String role, BundleMessage bundleMessage, String[] params) {
		printLogger.setRole(role);
		if ("infoRole".equals(role)) {
			printLogger.info(bundleMessage, params);
		} else if ("errorRole".equals(role)) {
			printLogger.error(bundleMessage, params);
		} else if ("warnRole".equals(role)) {
			printLogger.warn(bundleMessage, params);
		} else if ("debugRole".equals(role)) {
			printLogger.debug(bundleMessage, params);
		}
	}
	
	public static void main(String[] s) {
		System.out.println(getBW6ErrorCode("BW-JIRA-100007"));
	}

	public static boolean isDebugOpen() {
		return true;
	}

	/**
	 * debug with specified debug message code
	 * 
	 * @param code
	 * @param params
	 */
	public static void debug(String code, String... params) {
		if (isDebugOpen()) {
			trace(code, params);
		}
	}
	
}
