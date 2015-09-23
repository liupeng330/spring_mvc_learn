<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 9/22/15
  Time: 11:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form:form method="post" modelAttribute="MyLoginInfo">
  UserName: <form:input path="userName" id="user_name"/><br/>
  Password: <form:input path="password" id="pass_word"/><br/>
  <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
