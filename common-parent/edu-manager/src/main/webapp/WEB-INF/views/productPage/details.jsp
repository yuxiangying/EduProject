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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/userstyle/css/lightbox.css" type="text/css" media="screen" />

    <script src="${pageContext.request.contextPath}/userstyle/js/prototype.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/userstyle/js/scriptaculous.js?load=effects" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/userstyle/js/lightbox.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/userstyle/js/java.js"></script>
</head>
<body style="background-color: rgba(0,0,0,0);">
            <div class="crumb_nav">
                <a href="index.html">home</a> &gt;&gt; product name
            </div>
            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet1.gif" alt="" title="" /></span>Product name</div>

            <div class="feat_prod_box_details">

                <div class="prod_img"><a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/prod1.gif" alt="" title="" border="0" /></a>
                    <br /><br />
                    <a href="${pageContext.request.contextPath}/userstyle/images/big_pic.jpg" rel="lightbox"><img src="${pageContext.request.contextPath}/userstyle/images/zoom.gif" alt="" title="" border="0" /></a>
                </div>

                <div class="prod_det_box">
                    <div class="box_top"></div>
                    <div class="box_center">
                        <div class="prod_title">Details</div>
                        <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.<br />
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.                    </p>
                        <div class="price"><strong>PRICE:</strong> <span class="red">100 $</span></div>
                        <div class="price"><strong>COLORS:</strong>
                            <span class="colors"><img src="${pageContext.request.contextPath}/userstyle/images/color1.gif" alt="" title="" border="0" /></span>
                            <span class="colors"><img src="${pageContext.request.contextPath}/userstyle/images/color2.gif" alt="" title="" border="0" /></span>
                            <span class="colors"><img src="${pageContext.request.contextPath}/userstyle/images/color3.gif" alt="" title="" border="0" /></span>                    </div>
                        <a href="details.html" class="more"><img src="${pageContext.request.contextPath}/userstyle/images/order_now.gif" alt="" title="" border="0" /></a>
                        <div class="clear"></div>
                    </div>

                    <div class="box_bottom"></div>
                </div>
                <div class="clear"></div>
            </div>


            <div id="demo" class="demolayout">

                <ul id="demo-nav" class="demolayout">
                    <li><a class="active" href="#tab1">More details</a></li>
                    <li><a class="" href="#tab2">Related Products</a></li>
                </ul>

                <div class="tabs-container">

                    <div style="display: block;" class="tab" id="tab1">
                        <p class="more_details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.
                        </p>
                        <ul class="list">
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                        </ul>
                        <p class="more_details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.
                        </p>
                    </div>

                    <div style="display: none;" class="tab" id="tab2">
                        <div class="new_prod_box">
                            <a href="details.html">product name</a>
                            <div class="new_prod_bg">
                                <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                            </div>
                        </div>

                        <div class="new_prod_box">
                            <a href="details.html">product name</a>
                            <div class="new_prod_bg">
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
                                <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                            </div>
                        </div>

                        <div class="new_prod_box">
                            <a href="details.html">product name</a>
                            <div class="new_prod_bg">
                                <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                            </div>
                        </div>

                        <div class="new_prod_box">
                            <a href="details.html">product name</a>
                            <div class="new_prod_bg">
                                <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                            </div>
                        </div>



                        <div class="clear"></div>
                    </div>

                </div>


            </div>


</body>
<script type="text/javascript">

    var tabber1 = new Yetii({
        id: 'demo'
    });

</script>
</html>