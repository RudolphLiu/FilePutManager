<%--
  Created by IntelliJ IDEA.
  User: lzb22
  Date: 2018-06-18
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <h1>Welcome! ${nickname}</h1>
        <a href="<%=request.getContextPath() %>/shiro/logout">LogOut</a>
        <shiro:hasRole name="admin">
            <a href="<%=request.getContextPath() %>/adminpage">ADMIN TEST</a>
        </shiro:hasRole>
        <shiro:hasRole name="user">
            <a href="<%=request.getContextPath() %>/userpage">USER TEST</a>
        </shiro:hasRole>
        <shiro:hasRole name="admin">
            <a href="<%=request.getContextPath() %>/adminstrative">行政管理系统</a>
            <a href="<%=request.getContextPath() %>/sales">销售管理系统</a>
            <a href="<%=request.getContextPath() %>/fileupload">文件管理系统</a>
        </shiro:hasRole>
    </div>
</body>
</html>
