<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>範例 1：Struts 2 Annotation Example1</title>
</head>
<body>
<%--
自動對應 Action 機制，
struts2-convention-plugin.jar 為必要 Jar，
s:form 中的 action 為 example1，
則自動對應到 action.Example1.java 或 Example1Action.java， 
並轉頁到 WEB-INF/content/example1；
若 action 為 welcome-user，
則自動對應到 action.WelcomeUser.java 或 WelcomeUserAction.java，
並轉頁到 WEB-INF/content/welcome-user。
--%>
<s:form action="example1">
  <s:textfield name="userName" label="用戶名稱" />
  <s:submit value="送交" />
</s:form>
</body>
</html>
