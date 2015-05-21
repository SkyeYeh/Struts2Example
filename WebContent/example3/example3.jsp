<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>範例 3：Struts 2 Hello World Example</title>
</head>
<body>
<%--
使用 Xml 設定 Action，
因受自動對應機制 struts2-convention-plugin.jar 影響，
action 為 example3 會自動對應到 Example3Action，
固 action 設定為 e3，使用 struts.xml 設定。
--%>
<s:form action="e3">
  <s:textfield name="userName" label="用戶名稱" />
  <s:submit value="送交" />
</s:form>
</body>
</html>
