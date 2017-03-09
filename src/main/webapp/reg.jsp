<%--
  Created by IntelliJ IDEA.
  User: 001117020015
  Date: 2017/3/6
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/reg" method="POST" modelAttribute="user">
    <ul style="list-style-type: none;">
        <li>用户名：<input type="text" name="name">
        <li>密  码:   <input type="password"  name="password">
        <li>ID:   <input type="text"  name="id">
        <li>  <input type="submit" value="注册">
    </ul>
</form>
<%----%>
<%----%>
</body>
</html>
