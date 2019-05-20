<%--<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
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
            background: url("${pageContext.request.contextPath}/img/login_bg_02.jpg") no-repeat center center;
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

    </div>&lt;%&ndash;user/login&ndash;%&gt;
    <div id="loginDiv_from" class="div_from">
        <form action="${pageContext.request.contextPath}/managerBar" method="post">
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
</html>--%>
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
    <!--[if lt IE 9]>
    <!--<script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/lib/respond.min.js"></script>-->
    <![endif]-->
    <link href="${pageContext.request.contextPath}/managerstyle/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/managerstyle/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/managerstyle/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/managerstyle/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>flower</title>
    <meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
    <meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">

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
                    <input id = "verifyCode" name = "verifyCode" class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码'}" onclick="if(this.value=='验证码'){this.value='';}" value="验证码" style="width:210px;" maxlength="4">
                    <img id="captchaImg" src="${pageContext.request.contextPath}/login/checkCode" width="130px" height="41px" onclick="this.src=this.src+'?'"> <%--<a id="kanbuq" href="javascript:;">看不清，换一张</a>--%> </div>
            </div>
            <div id = "field" style="margin-top: 5px;margin-left: 180px;">
                <span id="err" style="color: red"></span>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <label for="online">
                    <label for="online">
                        <input type="checkbox" name="online" id="online" value="">
                        使我保持登录状态</label>
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input name="login" id="login" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/managerstyle/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
//提交
    $('#login').click(function () {
        var userName = $('#userName').val();
        var password = $('#password').val();
        var verifyCode = $('#verifyCode').val();
        $.ajax({
            type:'post',
            data:{userName: userName, password: password,verifyCode : verifyCode},
            dataType:'json',
            async: true,
            url:'${pageContext.request.contextPath}/login/userLogin',
            success:function(data){
                if(data==null){
                    alert("没有这个用户！")
                }else{
                    alert("成功！")
                }
            },
            error:function(){
                alert('服务繁忙,请稍后再试');
            }
        });


    });
</script>
</body>
</html>
