<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
    <meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">

    <title>Flower Shop</title>
    <base href="<%=basePath+"/"%>"><%--此作用就是省略写全路径--%>
    <!--[if lt IE 9]>
    <!--<script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/lib/respond.min.js"></script>-->
    <!--[endif]-->
    <link href="managerstyle/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="managerstyle/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="managerstyle/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="managerstyle/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<%--<div class="header"></div>--%>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal">
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-xs-8">
                    <input id="userName" name="userName" type="text" placeholder="账户" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input id = "verifyCode" name = "verifyCode" class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码'}" onclick="if(this.value=='验证码'){this.value='';} $('#err').empty();" value="验证码" style="width:210px;" maxlength="4">
                    <img id="captchaImg" src="login/checkCode" width="130px" height="41px" onclick="this.src=this.src+'?'"> <%--<a id="kanbuq" href="javascript:;">看不清，换一张</a>--%> </div>
            </div>
            <div id = "field" style="margin-top: 10px;margin-left: 180px;margin-bottom: 0px;">
                &nbsp;<span id="err" style="color: red"></span>
            </div>
            <div class="row cl" style="margin-top: 3px !important;">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <label for="online">
                    <label for="online">
                        <input type="checkbox" name="online" id="online" value="">
                        记住密码</label>
                    </label>
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input name="login" id="login" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    <input name="cancel" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                </div>
            </div>
        </form>
    </div>
</div>
<%--
<div class="footer">Copyright 你的公司名称 by H-ui.admin v3.1</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/static/h-ui/js/H-ui.min.js"></script>
--%>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/lib/jquery/"></script>--%>
<script type="text/javascript" src="js/jar/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</body>
</html>
