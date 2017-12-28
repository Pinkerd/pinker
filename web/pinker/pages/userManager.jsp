<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pinker.entity.pk_user" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/28
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户管理界面</title>
    <style>
        .search{
          display: inline-block;float: left;margin-left:300px;margin-bottom: 30px;
        }
    </style>
</head>
<body>
<h1 align="center">用户列表</h1>
<form action="http://localhost:8080/pinker/UsersServlet?method=findId" method="post" id="idFrom">
    <table  align="center" class="search">
        <tr>
            <td>
                <input  type="text"  name="byId" size="40" style="width:200px;height:20px;"
                placeholder="输入用户ID"/>
            </td>
            <td>
                <input type="submit" value="搜索" id="idButton">
            </td>
        </tr>

    </table>
</form>
<form action="http://localhost:8080/pinker/UsersServlet?method=findName" method="post">
    <table align="center" class="search">
        <tr>
            <td>
                <input  type="search"  name="byName" size="40" style="width:200px;height:20px;"
                        placeholder="输入用户名"/>
            </td>
            <td>
                <input type="submit" value="搜索" id="nameButton">
            </td>
        </tr>

    </table>
</form>

<table border="1" align="center" style="text-align: center">

    <tr>
        <td>用户ID</td>
        <td>登录名</td>
        <td>密码</td>
        <td>用户名</td>
        <td>email</td>
        <td>角色ID</td>
        <td>当前状态</td>
        <td>创建时间</td>
        <td>最后登陆</td>
        <td>居住地</td>
        <td>毕业学校</td>
        <td>性别</td>
        <td>生日</td>
        <td>星座</td>
        <td>个人简介</td>
        <td>头像</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${userlist}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.loginName}</td>
            <td>${user.password}</td>
            <td>${user.username}</td>
            <td>${user.email}</td>
            <td>${user.roleId}</td>
            <td>${user.status}</td>
            <td>${user.createtime}</td>
            <td>${user.lastlogin}</td>
            <td>${user.residence}</td>
            <td>${user.school}</td>
            <td>${user.gender}</td>
            <td>${user.birthday}</td>
            <td>${user.constellation}</td>
            <td>${user.introduction}</td>
            <td>${user.header}</td>
            <td>
            <a href="#" onclick="window.confirm('确定删除用户?  ID：${user.id}/用户名：${user.username}')?
                    this.href='http://localhost:8080/pinker/UsersServlet?method=deleteUser&id=${user.id}'
                    :this.href='javascript:void()';">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
    $(document).ready(function(){


    });

</script>
</body>
</html>
