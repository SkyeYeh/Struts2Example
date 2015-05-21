<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>範例 4：Struts 2 Validation Using validate() Method Example</title>
<%-- 驗證時需將 s:head 放置於 head 中。 --%>
<s:head />
</head>
<body>
<%--
驗證
--%>
<s:form action="e4">
<s:textfield name="userName" label="User Name" />
<s:password name="password" label="Password" />
<s:submit value="Login" />
</s:form>
</body>
</html>