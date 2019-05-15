<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>母婴网站</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/loginCtl.css">
    <style type="text/css">
        body{
            background: url("${pageContext.request.contextPath}/img/login_bg.jpg") no-repeat center center;
            background-size: 100% 100%;
            /* filter:alpha(opacity:50); opacity:0.5;  -moz-opacity:0.5;-khtml-opacity: 0.5;*/
            text-align: center;
        }
    </style>
</head>
<body>
<div id="loginDiv">
    <div id="loginDiv_title">
        <div id="loginDiv_title_login" onclick="onclickLogin();">
            <span style="color: white;font-size: 26px">登录</span>
        </div>
        <div id="loginDiv_title_register" onclick="onclickRegister();">
            <span style="color: white;font-size: 26px">注册</span>
        </div>

    </div>
    <div id="loginDiv_from" class="div_from">
        <form action="user/userLogin.do" method="post">
            <input class="userName" name="userName" type="text" value="请输入用户名" onkeydown="bluert();" onblur="userNameRes();" /> <br/>
            <br/>
            <input class="pw" name="pw" type="password" value="请输入密码"/><br/>
            <input class="sb" type="submit" value="登录"/>
        </form>
    </div>

    <div id="registerDiv_from" class="div_from" style="display: none;">
        <form action="user/userRegister.do" method="post">
            <input class="userName" name="userNameRegiester" type="text" value="请输入用户名" onkeydown="bluert();" onblur="userNameRes();" /> <br/>
            <br/>
            <input class="pw" name="pwRegiester" type="password" value="请输入密码"/><br/>
            <input class="sb" type="submit" value="注册"/>
        </form>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/loginCtl.js"></script>
</body>
</html>
