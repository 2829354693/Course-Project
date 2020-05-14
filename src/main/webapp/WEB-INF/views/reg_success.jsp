<%--
  Created by IntelliJ IDEA.
  User: 28293
  Date: 2020/4/30
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>注册成功</title>
</head>
<body>
<div style="width: 500px;margin: auto;">
    <h2>注册成功！</h2>
    <ul>
        <li>头像：<img src="/head_pic/${user.headPic}" width="50" height="50" alt="头像"></li>
        <li>您的姓名：${user.name}</li>
        <li>您的性别：${user.sex}</li>
        <li>您的爱好：${user.hobby}</li>
        <li>您的生日：    <fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></li>
        <li>您注册的时间：<fmt:formatDate value="${user.regTime}" type="both"/></li>
    </ul>

</div>

</body>
</html>
