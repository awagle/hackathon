/**
 * 
 */
package com.tibco.plugin.jira.util;

import com.tibco.neo.localized.BundleMessage;

/**
 * @author hnembhwa
 *
 */
public class PrintLogger {

	private String role;

	public void debug(String arg0) {
		if (this.isDebugEnabled())
			System.out.println(arg0);
	}

	public void debug(BundleMessage arg0) {
		if (this.isDebugEnabled()) {
			System.out.println(arg0.getComponentID() + " : "
					+ arg0.getBundleName());
			System.out.println(arg0.getErrorCode() + " : " + arg0.toString());
		}
	}

	public void debug(BundleMessage arg0, Object[] arg1) {
		if (this.isDebugEnabled()) {
			String realMsg = arg0.format(arg1);
			System.out.println(arg0.getComponentID() + " : "
					+ arg0.getBundleName());
			System.out.println(arg0.getErrorCode() + " : " + realMsg);
		}
	}

	public void debug(String arg0, String arg1) {
		if (this.isDebugEnabled()) {
			System.out.println(arg0 + " : " + arg1);
		}
	}

	public void error(BundleMessage arg0) {
		if (this.isErrorEnabled()) {
			System.err.println(arg0.getComponentID() + " : "
					+ arg0.getBundleName());
			System.err.println(arg0.getErrorCode() + " : " + arg0.toString());
		}
	}

	public void error(BundleMessage arg0, Object[] arg1) {
		if (this.isErrorEnabled()) {
			String realMsg = arg0.format(arg1);
			System.err.println(arg0.getComponentID() + " : "
					+ arg0.getBundleName());
			System.err.println(arg0.getErrorCode() + " : " + realMsg);
		}
	}

	public void info(BundleMessage arg0) {
		if (this.isInfoEnabled()) {
			System.out.println(arg0.getComponentID() + " : "
					+ arg0.getBundleName());
			System.out.println(arg0.getErrorCode() + " : " + arg0.toString());
		}
	}

	public void info(BundleMessage arg0, Object[] arg1) {
		if (this.isInfoEnabled()) {
			String realMsg = arg0.format(arg1);
			System.out.println(arg0.getComponentID() + " : "
					+ arg0.getBundleName());
			System.out.println(arg0.getErrorCode() + " : " + realMsg);
		}
	}

	public boolean isDebugEnabled() {
		return "debugRole".equals(role);
	}

	public boolean isErrorEnabled() {
		return "errorRole".equals(role);
	}

	public boolean isInfoEnabled() {
		return "infoRole".equals(role);
	}

	public boolean isWarnEnabled() {
		return "warnRole".equals(role);
	}

	public void warn(BundleMessage arg0) {
		if (this.isWarnEnabled()) {
			System.out.println(arg0.getComponentID() + " : "
					+ arg0.getBundleName());
			System.out.println(arg0.getErrorCode() + " : " + arg0.toString());
		}
	}

	public void warn(BundleMessage arg0, Object[] arg1) {
		if (this.isWarnEnabled()) {
			String realMsg = arg0.format(arg1);
			System.out.println(arg0.getComponentID() + " : "
					+ arg0.getBundleName());
			System.out.println(arg0.getErrorCode() + " : " + realMsg);
		}
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
