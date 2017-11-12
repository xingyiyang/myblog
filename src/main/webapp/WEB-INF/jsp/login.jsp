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

    <link rel="stylesheet" type="text/css" href="<%=basePath %>/css/login.css">

</head>

<body>
<div class="lg">
    <form action="<%=request.getContextPath()%>/user/login" method="POST">
        <div class="lg_top"></div>
        <div class="lg_main">
            <div class="lg_m_1">

                <input name="userName" placeholder="用户名/ 账号/ 邮箱" type="text" value="" class="ur" />
                <input name="userPwd" placeholder="密码" type="password" value="" class="pw" />
                <div class="forget_zhuce">
                    <span style="padding-right:75px"><a href="#">忘记密码</a></span>
                    <span style="padding-left:85px;"><a href="#">注册</a></span>
                </div>
            </div>
        </div>
        <div class="lg_foot">
            <input type="submit" value="登录" class="bn" />
        </div>
        <h4>${errormessage}</h4>
    </form>
</div>

<div style="text-align:center; color:#778899; padding-bottom:20px;">
    <p>&copy; 2015-2.16.川大异枝花团队</p>
</div>
</body>
</html>

