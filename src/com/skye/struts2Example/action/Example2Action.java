package com.skye.struts2Example.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * 使用註解設定 Action。
 * 
 * @author Skye
 */
public class Example2Action {
	private String userName;

	@Action(value = "/example2", results = { @Result(name = "success", location = "/results/example2-success.jsp") })
	public String execute() throws Exception {
		System.out.println("userName: " + userName);
		return "success";
	}

	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            要設定的 userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
