<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lzb22
  Date: 2018/7/2
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <table>
    <c:forEach items="${userlist}" var="u">

        <b>${u.fu_username}</b>
        <b>${u.fu_realname}</b>
        <b>${u.fu_gender}</b>
    </c:forEach>
    </table>
</body>
</html>
