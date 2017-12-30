<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pinker.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/28
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<h1 align="center">查询结果</h1>

<table border="1"  width="60%" align="center" style="text-align: center">

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
                                this.href='http://localhost:8080/pinker/UsersServlet?method=freezeUser&id=${user.id}&status=${user.status}'
                                :this.href='javascript:void()';">还原/冻结</a>
                    </td>
                </tr>
            </c:forEach>

        </table>


</body>
</html>
