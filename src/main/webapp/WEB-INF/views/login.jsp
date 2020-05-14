<%--
  Created by IntelliJ IDEA.
  User: 28293
  Date: 2020/4/21
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
</head>
<body>
    <div style="margin: auto;width: 500px;height: 500px;">
        <div style="margin: auto;width: 300px;">
            <form method="post" action="login">
                <input type="text" name="username" placeholder="请输入用户名"><br>
                <input type="password" name="password" placeholder="请输入密码"><br>
                <button type="submit">登录</button>
            </form>
            <a href="register" >去注册</a>
        </div>
    </div>

</body>
</html>
