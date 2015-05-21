package com.skye.struts2Example.action;

/**
 * 自動對應 Action 機制， struts2-convention-plugin.jar 為必要 Jar， s:form 中的 action 為
 * example1， 則自動對應到 action.Example1.java 或 Example1Action.java， 並轉頁到
 * WEB-INF/content/example1； 若 action 為 welcome-user， 則自動對應到
 * action.WelcomeUser.java 或 WelcomeUserAction.java， 並轉頁到
 * WEB-INF/content/welcome-user。 WEB-INF/content/welcome-user。
 * 
 * @author Skye
 */
public class Example1Action {
	private String userName;

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
