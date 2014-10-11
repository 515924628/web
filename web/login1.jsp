<%--
  Created by IntelliJ IDEA.
  User: zpy
  Date: 14.10.10
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<form action="login1.action">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td><input type="reset" value="重填"></td>
            <td><input type="submit" value="登陆"></td>
        </tr>
    </table>
</form>
</body>
</html>
