<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
    <title>Flower Shop</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/userstyle/css/style.css" />

</head>
<body style="background-color: rgba(0,0,0,0);">

<div class="crumb_nav">
    <a href="index.html">home</a> &gt;&gt; category name
</div>
<div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet1.gif" alt="" title="" /></span>Category products</div>

<div class="new_products">

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/new_icon.gif" alt="" title="" /></span>
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/promo_icon.gif" alt="" title="" /></span>
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>


    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/promo_icon.gif" alt="" title="" /></span>
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">

            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/new_icon.gif" alt="" title="" /></span>
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>

    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/new_icon.gif" alt="" title="" /></span>
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>
    <div class="new_prod_box">
        <a href="details.html">product name</a>
        <div class="new_prod_bg">
            <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
        </div>
    </div>


    <div class="pagination">
        <span class="disabled"><<</span><span class="current">1</span><a href="#?page=2">2</a><a href="#?page=3">3</a>…<a href="#?page=199">10</a><a href="#?page=200">11</a><a href="#?page=2">>></a>
    </div>

</div>


<div class="clear"></div>
<!--end of left content--

</body>
</html>