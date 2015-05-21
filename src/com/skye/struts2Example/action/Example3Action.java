package com.skye.struts2Example.action;

/**
 * 使用 Xml 設定 Action， 因受自動對應機制 struts2-convention-plugin.jar 影響， action 為
 * example3 會自動對應到 Example3Action， 固 action 設定為 e3，使用 struts.xml 設定。
 * 
 * @author Skye
 */
public class Example3Action {
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
