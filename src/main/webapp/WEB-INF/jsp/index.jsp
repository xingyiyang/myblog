<%--
  Created by IntelliJ IDEA.
  User: xing
  Date: 2017/11/9
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>blog主页</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link href="<%=basePath %>/css/bootstrap.min.css" rel="stylesheet">

    <link href="<%=basePath %>/css/style.css" rel="stylesheet">
</head>

<body>
<!-- 顶部导航 -->
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation" id="menu-nav">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">xyy-Pic</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#ad-carousel">综述</a></li>
                <li><a href="#summary-container">简述</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">特点 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#feature-tab" data-tab="tab-chrome">Chrome</a></li>
                        <li><a href="#feature-tab" data-tab="tab-firefox">Firefox</a></li>
                        <li><a href="#feature-tab" data-tab="tab-safari">Safari</a></li>
                        <li><a href="#feature-tab" data-tab="tab-opera">Opera</a></li>
                        <li class="divider"></li>
                        <li><a href="#feature-tab" data-tab="tab-ie">IE</a></li>
                    </ul>
                </li>
                <li><a href="#" data-toggle="modal" data-target="#about-modal">关于</a></li>
            </ul>
            <!--导航栏右部，一般的登录 注册-->
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">${user.userName}</a></li>
                <li><a href="<%=request.getContextPath()%>/index/login">登录</a></li>
                <li><a href="#">注册</a></li>
            </ul>
        </div>
    </div>
</div>
<header>
    <div class="widewrapper masthead">
        <div class="container">
            <a href="index.html" id="logo">
                <img src="img/logo.png" alt="clean Blog">
            </a>

            <div id="mobile-nav-toggle" class="pull-right">
                <a href="#" data-toggle="collapse" data-target=".clean-nav .navbar-collapse">
                    <i class="fa fa-bars"></i>
                </a>
            </div>

            <nav class="pull-right clean-nav">
                <div class="collapse navbar-collapse">
                    <ul class="nav nav-pills navbar-nav">

                        <li>
                            <a href="<%=request.getContextPath()%>/index/index">Home</a>
                        </li>
                        <li>
                            <a href="<%=request.getContextPath()%>/index/about">About</a>
                        </li>
                        <li>
                            <a href="<%=request.getContextPath()%>/index/contact">Contact</a>
                        </li>
                    </ul>
                </div>
            </nav>

        </div>
    </div>

    <div class="widewrapper subheader">
        <div class="container">
            <div class="clean-breadcrumb">
                <a href="#">Blog</a>
            </div>

            <div class="clean-searchbox">
                <form action="#" method="get" accept-charset="utf-8">
                    <input class="searchfield" id="searchbox" type="text" placeholder="Search">
                    <button class="searchbutton" type="submit">
                        <i class="fa fa-search"></i>
                    </button>
                </form>
            </div>
        </div>
    </div>
</header>

<div class="widewrapper main">
    <div class="container">
        <div class="row">
            <div class="col-md-8 blog-main">
                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <article class=" blog-teaser">
                            <header>
                                <img src="img/1.jpg" alt="">
                                <h3><a href="<%=request.getContextPath()%>/index/single">How to Create Template</a></h3>
                                <span class="meta">19 August 2017, John Doe</span>
                                <hr>
                            </header>

                        </article>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <article class="blog-teaser">
                            <header>
                                <img src="img/2.jpg" alt="">
                                <h3><a href="<%=request.getContextPath()%>/index/single">Clean Personal Blog Template</a></h3>
                                <span class="meta">19 August 2017, John Doe</span>
                                <hr>
                            </header>

                        </article>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <article class="blog-teaser">
                            <header>
                                <img src="img/4.jpg" alt="">
                                <h3><a href="<%=request.getContextPath()%>/index/single">Blackor - Responsive HTML5 Theme</a></h3>
                                <span class="meta">19 August 2017, John Doe</span>
                                <hr>
                            </header>

                        </article>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <article class=" blog-teaser">
                            <header>
                                <img src="img/1.jpg" alt="">
                                <h3><a href="<%=request.getContextPath()%>/index/single">How to Create Template</a></h3>
                                <span class="meta">19 August 2017, John Doe</span>
                                <hr>
                            </header>

                        </article>
                    </div>

                </div>
                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <article class="blog-teaser">
                            <header>
                                <img src="img/3.jpg" alt="">
                                <h3><a href="<%=request.getContextPath()%>/index/single">Blackor - Responsive HTML5 Theme</a></h3>
                                <span class="meta">19 August 2017, John Doe</span>
                                <hr>
                            </header>

                        </article>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <article class=" blog-teaser">
                            <header>
                                <img src="img/1.jpg" alt="">
                                <h3><a href="<%=request.getContextPath()%>/index/single">How to Create Template</a></h3>
                                <span class="meta">19 August 2017, John Doe</span>
                                <hr>
                            </header>

                        </article>
                    </div>

                </div>
                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <article class="blog-teaser">
                            <header>
                                <img src="img/3.jpg" alt="">
                                <h3><a href="<%=request.getContextPath()%>/index/single">Blackor - Responsive HTML5 Theme</a></h3>
                                <span class="meta">19 August 2017, John Doe</span>
                                <hr>
                            </header>

                        </article>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <article class=" blog-teaser">
                            <header>
                                <img src="img/5.jpg" alt="">
                                <h3><a href="<%=request.getContextPath()%>/index/single">How to Create Template</a></h3>
                                <span class="meta">19 August 2017, John Doe</span>
                                <hr>
                            </header>

                        </article>
                    </div>

                </div>

                <div class="paging">
                    <a href="#" class="older">Older Post</i></a>
                </div>
            </div>
            <aside class="col-md-4 blog-aside">

                <div class="aside-widget">
                    <header>
                        <h3>Featured Post</h3>
                    </header>
                    <div class="body">
                        <ul class="clean-list">
                            <li><a href="">Clean - Responsive HTML5 Template</a></li>
                            <li><a href="">Responsive Pricing Table</a></li>
                            <li><a href="">Yellow HTML5 Template</a></li>
                            <li><a href="">Blackor Responsive Theme</a></li>
                            <li><a href="">Portfolio Bootstrap Template</a></li>
                            <li><a href="">Clean Slider Template</a></li>
                        </ul>
                    </div>
                </div>

                <div class="aside-widget">
                    <header>
                        <h3>Related Post</h3>
                    </header>
                    <div class="body">
                        <ul class="clean-list">
                            <li><a href="">Blackor Responsive Theme</a></li>
                            <li><a href="">Portfolio Bootstrap Template</a></li>
                            <li><a href="">Clean Slider Template</a></li>
                            <li><a href="">Clean - Responsive HTML5 Template</a></li>
                            <li><a href="">Responsive Pricing Table</a></li>
                            <li><a href="">Yellow HTML5 Template</a></li>
                        </ul>
                    </div>
                </div>

                <div class="aside-widget">
                    <header>
                        <h3>Tags</h3>
                    </header>
                    <div class="body clearfix">
                        <ul class="tags">
                            <li><a href="#">HTML5</a></li>
                            <li><a href="#">CSS3</a></li>
                            <li><a href="#">COMPONENTS</a></li>
                            <li><a href="#">TEMPLATE</a></li>
                            <li><a href="#">PLUGIN</a></li>
                            <li><a href="#">BOOTSTRAP</a></li>
                            <li><a href="#">TUTORIAL</a></li>
                            <li><a href="#">UI/UX</a></li>
                        </ul>
                    </div>
                </div>
            </aside>
        </div>
    </div>
</div>

<footer>
    <div class="widewrapper footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 footer-widget">
                    <h3> <i class="fa fa-user"></i>About</h3>

                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab animi laboriosam nostrum consequatur fugiat at, labore praesentium modi, quasi dolorum debitis reiciendis facilis, dolor saepe sint nemo, earum molestias quas.</p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum, error aspernatur assumenda quae eveniet.</p>
                </div>

                <div class="col-md-4 footer-widget">
                    <h3> <i class="fa fa-pencil"></i> Recent Post</h3>
                    <ul class="clean-list">
                        <li><a href="">Clean - Responsive HTML5 Template</a></li>
                        <li><a href="">Responsive Pricing Table</a></li>
                        <li><a href="">Yellow HTML5 Template</a></li>
                    </ul>
                </div>

                <div class="col-md-4 footer-widget">
                    <h3> <i class="fa fa-envelope"></i>Contact Me</h3>

                    <p>Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet.</p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil fugiat, cupiditate veritatis excepturi tempore explicabo.</p>
                    <div class="footer-widget-icon">
                        <i class="fa fa-facebook"></i><i class="fa fa-twitter"></i><i class="fa fa-google"></i>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <div class="widewrapper copyright">
        Copyright &copy; 2017.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
    </div>
</footer>

<script src="<%=basePath %>/js/jquery.min.js"></script>
<script src="<%=basePath %>/js/bootstrap.min.js"></script>
<script src="<%=basePath %>/js/modernizr.js"></script>
</body>
</html>
