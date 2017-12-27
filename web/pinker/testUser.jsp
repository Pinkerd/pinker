<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pinker.entity.pk_user" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>testUser.jsp</title>
</head>
<body>
<%
    ArrayList<pk_user> list = (ArrayList<pk_user>) request.getAttribute("list");
%>
所有的学生信息 http://localhost:8080/pinker/UsersServlet?method=findAll<br>
<%=list%>

</body>
</html>
