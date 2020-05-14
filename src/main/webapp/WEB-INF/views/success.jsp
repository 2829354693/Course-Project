<%--
  Created by IntelliJ IDEA.
  User: 28293
  Date: 2020/4/21
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>主页</title>
</head>
<body>
<div style="margin: auto;width: 600px;">
    <h1>欢迎您！${sessionScope.user.name}</h1>

    <h2>用户列表：</h2>
    <table border="1">
        <thead>
            <tr>
                <th>用户id</th>
                <th>用户头像</th>
                <th>用户名称</th>
                <th>用户性别</th>
                <th>用户爱好</th>
                <th>生日</th>
                <th>注册时间</th>
                <th width="50">操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <th>${user.id}</th>
                    <th><img width="50px" height="50px" src="/head_pic/${user.headPic}" alt="头像"></th>
                    <th>${user.name}</th>
                    <th>${user.sex}</th>
                    <th>${user.hobby}</th>
                    <th><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></th>
                    <th><fmt:formatDate value="${user.regTime}" type="both"/></th>
                    <th>
                        <a href="update?id=${user.id}">修改</a>
                        <a href="delete?id=${user.id}">删除</a>
                    </th>
                </tr>
            </c:forEach>
        </tbody>
    </table>


</div>


</body>
</html>
