<%--
  Created by IntelliJ IDEA.
  User: lzb22
  Date: 2018-06-18
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Brand</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Link</a></li>
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <shiro:hasRole name="admin">
                    <li><a href="<%=request.getContextPath() %>/adminpage">ADMIN</a></li>
                </shiro:hasRole>
                <shiro:hasRole name="user">
                    <li><a href="<%=request.getContextPath() %>/userpage">USER</a></li>
                </shiro:hasRole>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${token.fu_realname} <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=request.getContextPath() %>/shiro/logout">LogOut</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

    <div align="center" style="margin-left: 30%;margin-right: 30%">
       <%-- <shiro:hasRole name="admin">
            <div class="list-group">

                <a href="<%=request.getContextPath() %>/adminstrative" class="list-group-item">
                    <h4 class="list-group-item-heading">行政管理系统</h4>
                </a>

                <a href="<%=request.getContextPath() %>/sales" class="list-group-item">
                    <h4 class="list-group-item-heading">销售管理系统</h4>
                </a>
                <a href="<%=request.getContextPath() %>/fileupload" class="list-group-item">
                    <h4 class="list-group-item-heading">文件管理系统</h4>
                </a>

            </div>

        </shiro:hasRole>--%>
            <h3>个人信息</h3>
           <hr>
           <table class="table table-condensed">
               <tr>
                   <th>昵称</th>
                   <td>${token.fu_realname}</td>
               </tr>
               <tr>
                   <th>手机号</th>
                   <td>${token.fu_phonenum}</td>
               </tr>
               <tr>
                   <th>性别</th>
                   <td>${token.fu_gender}</td>
               </tr>
               <tr>
                   <th>创建时间</th>
                   <td><fmt:formatDate value="${token.create_time}" pattern="yyyy年MM月dd日HH点mm分ss秒" /></td>
               </tr>
           </table>
    </div>
</body>
</html>
