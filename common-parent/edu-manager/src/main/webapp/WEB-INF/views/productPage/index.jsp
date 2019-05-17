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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jar/jquery-3.2.1.min.js"></script>
</head>
<body>
<div id="wrap">

    <div class="header">
        <div class="logo"><a href="index.html"><img src="${pageContext.request.contextPath}/userstyle/images/logo.gif" alt="" title="" border="0" /></a></div>
        <div id="menu">
            <ul>
                <li class="selected"><a href="${pageContext.request.contextPath}/product/home" target="leftContentFrameName">首&nbsp;&nbsp;&nbsp;&nbsp;页</a></li>
                <li><a href="${pageContext.request.contextPath}/product/category" target="leftContentFrameName">所有鲜花</a></li>
                <li><a href="${pageContext.request.contextPath}/product/specials" target="leftContentFrameName">主题鲜花</a></li>
                <%--<li><a href="myaccount.html">my accout</a></li>--%>
                <li><a href="${pageContext.request.contextPath}/product/register" target="leftContentFrameName">用户注册</a></li>
                <li><a href="${pageContext.request.contextPath}/product/details" target="leftContentFrameName">鲜花咨讯</a></li>
                <li><a href="${pageContext.request.contextPath}/product/about" target="leftContentFrameName">关于我们</a></li>
                <li><a href="${pageContext.request.contextPath}/product/contact" target="leftContentFrameName">联系我们</a></li>
            </ul>
        </div>


    </div>


    <div class="center_content">
        <div class="left_content">

            <%--<div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet1.gif" alt="" title="" /></span>Featured products</div>

            <div class="feat_prod_box">

                <div class="prod_img"><a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/prod1.gif" alt="" title="" border="0" /></a></div>

                <div class="prod_det_box">
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



            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet2.gif" alt="" title="" /></span>New products</div>

            <div class="new_products">

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
                        <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                    </div>
                </div>

                <div class="new_prod_box">
                    <a href="details.html">product name</a>
                    <div class="new_prod_bg">
                        <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                    </div>
                </div>

            </div>


            <div class="clear"></div>--%>
            <iframe style="height: 100%;width: 100%;" id="leftContentFrameId" name="leftContentFrameName" scrolling="no" frameborder="0" src="${pageContext.request.contextPath}/product/home"></iframe>
        </div><!--end of left content-->

        <div class="right_content">
            <div class="languages_box">
                <span class="red">Languages:</span>
                <a href="#" class="selected"><img src="${pageContext.request.contextPath}/userstyle/images/gb.gif" alt="" title="" border="0" /></a>
                <a href="#"><img src="${pageContext.request.contextPath}/userstyle/images/fr.gif" alt="" title="" border="0" /></a>
                <a href="#"><img src="${pageContext.request.contextPath}/userstyle/images/de.gif" alt="" title="" border="0" /></a>
            </div>
            <div class="currency">
                <span class="red">Currency: </span>
                <a href="#">GBP</a>
                <a href="#">EUR</a>
                <a href="#" class="selected">USD</a>
            </div>


            <div class="cart">
                <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/cart.gif" alt="" title="" /></span>My cart</div>
                <div class="home_cart_content">
                    3 x items | <span class="red">TOTAL: 100$</span>
                </div>
                <a href="cart.html" class="view_cart">view cart</a>

            </div>




            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet3.gif" alt="" title="" /></span>About Our Shop</div>
            <div class="about">
                <p>
                    <img src="${pageContext.request.contextPath}/userstyle/images/about.gif" alt="" title="" class="right" />
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
                </p>

            </div>

            <div class="right_box">

                <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet4.gif" alt="" title="" /></span>热卖品种</div>
                <div class="new_prod_box">
                    <a href="details.html">product name</a>
                    <div class="new_prod_bg">
                        <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/promo_icon.gif" alt="" title="" /></span>
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
                        <span class="new_icon"><img src="${pageContext.request.contextPath}/userstyle/images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="${pageContext.request.contextPath}/userstyle/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                    </div>
                </div>

            </div>

            <div class="right_box">

                <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet5.gif" alt="" title="" /></span>材质选购</div>

                <ul class="list">
                    <li><a href="#">玫瑰花</a></li>
                    <li><a href="#">百合花</a></li>
                    <li><a href="#">康乃馨</a></li>
                    <li><a href="#">马蹄莲</a></li>
                    <li><a href="#">向日葵</a></li>
                    <li><a href="#">郁金香</a></li>
                    <li><a href="#">蓝玫瑰</a></li>
                    <li><a href="#">白玫瑰</a></li>
                    <li><a href="#">粉玫瑰</a></li>
                    <li><a href="#">红玫瑰</a></li>
                    <li><a href="#">满天星花</a></li>
                </ul>

                <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath}/userstyle/images/bullet6.gif" alt="" title="" /></span>需求选购</div>

                <ul class="list">
                    <li><a href="#">3.14白色情人节</a></li>
                    <li><a href="#">母亲节鲜花</a></li>
                    <li><a href="#">教师节鲜花</a></li>
                    <li><a href="#">3.8节鲜花</a></li>
                    <li><a href="#">圣诞节鲜花</a></li>
                    <li><a href="#">5.20鲜花</a></li>
                    <li><a href="#">生日鲜花</a></li>
                    <li><a href="#">瓶插鲜花</a></li>
                    <li><a href="#">礼盒鲜花</a></li>
                </ul>

            </div>


        </div><!--end of right content-->




        <div class="clear"></div>
    </div><!--end of center content-->


    <div class="footer">
        <div class="left_footer"><img src="${pageContext.request.contextPath}/userstyle/images/footer_logo.gif" alt="" title="" /><br /> <a href="http://www.cssmoban.com/" title="free templates">cssmoban.com</a></div>
        <div class="right_footer">
            <a href="#">home</a>
            <a href="#">about us</a>
            <a href="#">services</a>
            <a href="#">privacy policy</a>
            <a href="#">contact us</a>

        </div>


    </div>


</div>
<script type="text/javascript">

    $(function(){

        $("#menu ul li").click(function() {

            $(this).siblings('li').removeClass('selected');  // 删除其他兄弟元素的样式

            $(this).addClass('selected');                            // 添加当前元素的样式

        });

    });
</script>
</body>
</html>