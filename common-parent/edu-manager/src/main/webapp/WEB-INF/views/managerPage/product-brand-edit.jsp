<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <base href="<%=basePath+"/"%>"><%--此作用就是省略写全路径--%>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="/favicon.ico" >
    <link rel="Shortcut Icon" href="/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="managerstyle/lib/html5shiv.js"></script>
    <script type="text/javascript" src="managerstyle/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="managerstyle/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="managerstyle/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="managerstyle/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="managerstyle/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="managerstyle/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="managerstyle/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <!--/meta 作为公共模版分离出去-->

    <title>添加用户 - H-ui.admin v3.1</title>
    <meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
    <meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
    <form action="" method="post" class="form form-horizontal" id="form-member-add">

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>产品id：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${productBrand.id}" placeholder="" id="brandId" name="brandId" readonly>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>品种名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${productBrand.brandname}" placeholder="" id="brandname" name="brandname">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">LOGO：</label>
            <div class="formControls col-xs-8 col-sm-9">
                    <label>原始logo</label>
                    <img id="oldLogoImg" src="${productBrand.logoname}" style="max-width:5%;max-height:5%;" onclick="toggele();" alt="原始logo">
                <label>&nbsp;&nbsp;&nbsp;&nbsp;修改后图片</label>
                <span class="btn-upload form-group">
				<input class="input-text upload-url" type="text" name="uploadfile" id="uploadfile" readonly nullmsg="请添加图片！" style="width:200px">
				<a href="javascript:void();" class="btn btn-primary radius upload-btn"><i class="Hui-iconfont">&#xe642;</i> 上传logo</a>
				<input type="file" multiple name="file-2" class="input-file">
				</span>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">所在城市：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" name="city">
					<option value="0">请选择产地</option>
					<c:forEach items="${brandPlaces}" var="brandPlace">
                        <option  value='${brandPlace.ctlCode}' ${brandPlace.ctlCode==productBrand.place?'selected':''}>${brandPlace.ctlParam}</option>
                    </c:forEach>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">具体描述：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="beizhu" cols="" rows="" class="textarea"  placeholder="${not empty productBrand.remark?productBrand.remark:'说点什么...最少输入10个字符'}" onKeyUp="$.Huitextarealength(this,100)"></textarea>
                <%--<c:choose>
                    <c:when test="${not empty productBrand.remark}">
                        <textarea name="beizhu" cols="" rows="" class="textarea"  placeholder="${productBrand.remark}" onKeyUp="$.Huitextarealength(this,100)"></textarea>
                    </c:when>
                    <c:otherwise>
                        <textarea name="beizhu" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)"></textarea>
                    </c:otherwise>
                </c:choose>--%>

                <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
            </div>
        </div>
    </form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="managerstyle/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="managerstyle/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="managerstyle/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="managerstyle/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="managerstyle/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="managerstyle/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="managerstyle/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="managerstyle/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<style>
    .max{
        width: 100%;
        height: auto;
    }
    .min{
        width: 100px;
        height: auto;
    }
</style>
<script type="text/javascript">
    $(function(){
        $('.skin-minimal input').iCheck({
            checkboxClass: 'icheckbox-blue',
            radioClass: 'iradio-blue',
            increaseArea: '20%'
        });

        $("#form-member-add").validate({
            rules:{
                username:{
                    required:true,
                    minlength:2,
                    maxlength:16
                },
                sex:{
                    required:true,
                },
                mobile:{
                    required:true,
                    isMobile:true,
                },
                email:{
                    required:true,
                    email:true,
                },
                uploadfile:{
                    required:true,
                },

            },
            onkeyup:false,
            focusCleanup:true,
            success:"valid",
            submitHandler:function(form){
                //$(form).ajaxSubmit();
                var index = parent.layer.getFrameIndex(window.name);
                //parent.$('.btn-refresh').click();
                parent.layer.close(index);
            }
        });
    });


    /*$(function(){
        $("#oldLogoImg").click(function(){
            var width = $(this).width();
            if(width==100)
            {
                $(this).width(200);
                $(this).height(300);
            }
            else
            {
                $(this).width(100);
                $(this).height(150);
            }
        });
    });*/
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>