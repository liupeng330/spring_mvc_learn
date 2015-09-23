<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 9/23/15
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title></title>
</head>
<body>
<sf:form modelAttribute="myUserInfo" method="post" enctype="application/x-www-form-urlencoded">
  lastName: <sf:input path="lastName" id="last_name"/> <br/>

  firtName: <sf:input path="firstName" id="first_name"/> <br/>

  age: <sf:input path="age" id="age"/> <br/>
  <sf:errors path="age" cssClass="error"/>

  <input type="submit" value="Submit"/>

</sf:form>
</body>
</html>
