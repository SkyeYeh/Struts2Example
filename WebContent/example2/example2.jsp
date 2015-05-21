<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>範例 2：Struts 2 Annotation Example2</title>
</head>
<body>
<%--
使用註解設定 Action。
--%>
<s:form action="example2">
  <s:textfield name="userName" label="用戶名稱" />
  <s:submit value="送交" />
</s:form>
</body>
</html>
