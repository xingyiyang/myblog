<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>首页</title>
    <link href="<%=basePath %>/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <h2>Hello World!</h2>
    <a href="<%=request.getContextPath()%>/index/index" target="_blank">博客页面</a>
    <a href="<%=request.getContextPath()%>/index/login" target="_blank">登录页面</a>
    <a href="<%=request.getContextPath()%>/index/province" target="_blank">测试级联省市镇</a>

    <script src="<%=basePath %>/js/jquery.min.js"></script>
    <script src="<%=basePath %>/js/bootstrap.min.js"></script>
</body>
</html>
