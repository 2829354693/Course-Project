<%--
  Created by IntelliJ IDEA.
  User: 28293
  Date: 2020/4/23
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <div style="margin: auto;width: 500px;">
        <form method="post" action="register" enctype="multipart/form-data">
            <label>
                <input type="text" name="name" placeholder="请输入用户名"><br>
                <input type="text" name="password" placeholder="请输入密码"><br>
                <input type="radio" name="sex" value="男生" checked>男生
                <input type="radio" name="sex" value="女生">女生
                <br>
                <input type="checkbox" name="hobby" value="写博客">写博客
                <input type="checkbox" name="hobby" value="看书">看书
                <input type="checkbox" name="hobby" value="玩游戏">玩游戏
                <br>
                头像：<input type="file" alt="头像" name="head_pic">
                <br>
                生日：<input type="date" placeholder="您的生日" name="birthdayStr">
            </label>

            <button type="submit" >注册</button>
        </form>
        <a href="./" >去登录</a>
    </div>

</body>
</html>
