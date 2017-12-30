<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pinker.entity.User" %><%--
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
    <title>黑名单列表</title>
    <style>
        .search{
            display: inline-block;float: left;margin-bottom: 30px;
        }
        .box{
            width: 1000px;
            height: 50px;
            margin: 0px auto;
        }
        #page_nav{
            width: 100%;
            height: 10px;
            margin: auto;
            text-align: center;
        }
    </style>
</head>
<body>
<h1 align="center">黑名单列表</h1>
<div class="box">
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
        <table align="center" class="search" style="margin-left:300px;float: right">
            <tr>
                <td>
                    <input  type="text"  name="byName" size="40" style="width:200px;height:20px;"
                            placeholder="输入用户名"/>
                </td>
                <td>
                    <input type="submit" value="搜索" id="nameButton">
                </td>
            </tr>

        </table>
    </form>
</div>
<table border="1"  width="60%" align="center" style="text-align: center">

    <tr>
        <td>用户ID</td>
        <td>登录名</td>
        <td>密码</td>
        <td>用户名</td>
        <td>email</td>
        <td>创建时间</td>
        <td>最后登陆</td>
        <td>性别</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${page.date}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.loginName}</td>
            <td>${user.password}</td>
            <td>${user.username}</td>
            <td>${user.email}</td>
            <td>${user.createtime}</td>
            <td>${user.lastlogin}</td>
            <td>${user.gender}</td>
            <td>
                <a href="#" onclick="window.confirm('确定解冻用户?  ID：${user.id}/用户名：${user.username}')?  /*1*/
                        this.href='http://localhost:8080/pinker/UsersServlet?method=freezeUser&id=${user.id}&status=${user.status}'
                        :this.href='javascript:void()';">解冻</a>
            </td>
        </tr>
    </c:forEach>

</table>

<%--分页--%>
<br>

<div id="page_nav">
    <a href="http://localhost:8080/pinker/UsersServlet?method=findUser&pageNumber=1" class="firstpage">首页</a>
    <a href="http://localhost:8080/pinker/UsersServlet?method=findUser&pageNumber=${page.pageNumber-1}" class="firstpage">上一页</a>
    <%--遍历生成页码--%>
    <c:forEach begin="1" end="${page.totalPage}" var="index">
        <c:choose>
            <c:when test="${index==page.pageNumber}">
                <span style="color: deeppink">[${page.pageNumber}]</span>
            </c:when>
            <c:otherwise>
                <a href="http://localhost:8080/pinker/UsersServlet?method=findUser&pageNumber=${index}">
                        ${index}</a>
            </c:otherwise>
        </c:choose>
    </c:forEach>

    <a href="http://localhost:8080/pinker/UsersServlet?method=findUser&pageNumber=${page.pageNumber+1}"  class="endpage">下一页</a>
    <a href="http://localhost:8080/pinker/UsersServlet?method=findUser&pageNumber=${page.totalPage}"  class="endpage">末页</a>
    共${page.totalPage}页，${page.totalRecord}条记录 到第
    <input value="${page.pageNumber}" name="pn" id="pn_input"/>页
    <input type="button" value="确定" id="jump" name="jump">
</div>

<script type="text/javascript"  src="../pinker/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
    $(document).ready(function(){

        if (${page.pageNumber==1}){
            $(".firstpage").css("display", "none");
        }
        if (${page.pageNumber==page.totalPage}){
            $(".endpage").css("display", "none");
        }

        $("#jump").click(function () {
            var no= $("#pn_input").val();
            var i=parseInt(no);
            if(i>${page.totalPage}){
                i=${page.totalPage};
            }
            if(i<1){
                i=1;
            }
            location.href="http://localhost:8080/pinker/UsersServlet?method=findUser&pageNumber="+i;
        })

    });
</script>
</body>
</html>
