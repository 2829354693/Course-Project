<%--
  Created by IntelliJ IDEA.
  User: 28293
  Date: 2020/4/23
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
    <div style="margin: auto;width: 600px;">
        <form method="post" action="update">
            <label>
                <input type="hidden" name="id" value="${user.id}">
                <input type="text" name="name" value="${user.name}" readonly><br>
                <input type="text" name="password" value="${user.password}"><br>

                <input type="radio" name="sex" value="男生" <c:if test="${user.sex eq '男生'}">checked</c:if>>男生
                <input type="radio" name="sex" value="女生" <c:if test="${user.sex eq '女生'}">checked</c:if>>女生
                <br>

                <input type="checkbox" name="hobby" value="写博客" <c:if test="${user.hobby eq '写博客'}">checked</c:if>>写博客
                <input type="checkbox" name="hobby" value="看书" <c:if test="${user.hobby eq '看书'}">checked</c:if>>看书
                <input type="checkbox" name="hobby" value="玩游戏" <c:if test="${user.hobby eq '玩游戏'}">checked</c:if>>玩游戏
                <br>
            </label>

            <button type="submit" >立即修改</button>
        </form>

    </div>


</body>
</html>
