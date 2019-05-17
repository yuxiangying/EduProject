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


            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet1.gif" alt="" title="" /></span>Special gifts</div>

            <div class="feat_prod_box">

                <div class="prod_img"><a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/prod1.gif" alt="" title="" border="0" /></a></div>

                <div class="prod_det_box">
                    <span class="special_icon"><img src="${pageContext.request.contextPath}/userstyle/images/special_icon.gif" alt="" title="" /></span>
                    <div class="box_top"></div>
                    <div class="box_center">
                        <div class="prod_title">Product name</div>
                        <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                        <a href="details.html" class="more">- more details -</a>
                        <div class="clear"></div>
                    </div>

                    <div class="box_bottom"></div>
                </div>
                <div class="clear"></div>
            </div>


            <div class="feat_prod_box">

                <div class="prod_img"><a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/prod2.gif" alt="" title="" border="0" /></a></div>

                <div class="prod_det_box">
                    <span class="special_icon"><img src="${pageContext.request.contextPath}/userstyle/images/special_icon.gif" alt="" title="" /></span>
                    <div class="box_top"></div>
                    <div class="box_center">
                        <div class="prod_title">Product name</div>
                        <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                        <a href="details.html" class="more">- more details -</a>
                        <div class="clear"></div>
                    </div>

                    <div class="box_bottom"></div>
                </div>
                <div class="clear"></div>
            </div>



            <div class="feat_prod_box">

                <div class="prod_img"><a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/prod1.gif" alt="" title="" border="0" /></a></div>

                <div class="prod_det_box">
                    <span class="special_icon"><img src="${pageContext.request.contextPath}/userstyle/images/special_icon.gif" alt="" title="" /></span>
                    <div class="box_top"></div>
                    <div class="box_center">
                        <div class="prod_title">Product name</div>
                        <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                        <a href="details.html" class="more">- more details -</a>
                        <div class="clear"></div>
                    </div>

                    <div class="box_bottom"></div>
                </div>
                <div class="clear"></div>
            </div>


            <div class="feat_prod_box">

                <div class="prod_img"><a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/prod2.gif" alt="" title="" border="0" /></a></div>

                <div class="prod_det_box">
                    <span class="special_icon"><img src="${pageContext.request.contextPath}/userstyle/images/special_icon.gif" alt="" title="" /></span>
                    <div class="box_top"></div>
                    <div class="box_center">
                        <div class="prod_title">Product name</div>
                        <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                        <a href="details.html" class="more">- more details -</a>
                        <div class="clear"></div>
                    </div>

                    <div class="box_bottom"></div>
                </div>
                <div class="clear"></div>
            </div>

            <div class="pagination">
                <span class="disabled"><<</span><span class="current">1</span><a href="#?page=2">2</a><a href="#?page=3">3</a>…<a href="#?page=199">10</a><a href="#?page=200">11</a><a href="#?page=2">>></a>
            </div>


            <div class="clear"></div>
        <!--end of left content-->


</body>
</html>