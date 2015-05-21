package com.skye.struts2Example.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author Skye
 */
public class Example4Action extends ActionSupport {
	private static final long serialVersionUID = 4666699613279047305L;
	private String userName;
	private String password;

	/**
	 * ActionSupport 定義之回傳值，動作執行失敗時回傳 ERROR。
	 */
	// public static final String ERROR = "error";

	/**
	 * ActionSupport 定義之回傳值，在需要用戶輸入更多資料時回傳 INPUT。
	 */
	// public static final String INPUT = "input";

	/**
	 * ActionSupport 定義之回傳值，當用戶沒有登入到系統時回傳 LOGIN。
	 */
	// public static final String LOGIN = "login";

	/**
	 * ActionSupport 定義之回傳值，當 Action 執行成功且沒有顯示畫面時回傳 NONE。
	 */
	// public static final String NONE = "none";

	/**
	 * ActionSupport 定義之回傳值，，當 Action 執行成功且顯示對應的結果時回傳 SUCCESS。
	 */
	// public static final String SUCCESS = "success";

	public String execute() throws Exception {
		System.out.println("userName: " + userName);
		return SUCCESS;
	}

	/**
	 * 覆寫 ActionSupport 中的 validate，若驗證錯誤則回傳ERROR。
	 */
	@Override
	public void validate() {
		if (getUserName().length() == 0) {
			addFieldError("userName", "請輸入帳號。");
		}
		if (getPassword().length() == 0) {
			addFieldError("password", getText("請輸入密碼。"));
		}
		return;
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

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            要設定的 password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
