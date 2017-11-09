<%--
  Created by IntelliJ IDEA.
  User: xing
  Date: 2017/11/9
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录页面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
</head>

<body>
<form action="<%=request.getContextPath()%>/user/login" method="get">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="userName" placeholder="账号/邮箱/用户名"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="userPwd" /></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录" /></td>
        </tr>
    </table>
</form>
<h3>${errormessage}</h3>
</body>
</html>

