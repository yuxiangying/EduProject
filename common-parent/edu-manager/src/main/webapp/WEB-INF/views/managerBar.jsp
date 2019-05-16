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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/nav.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/font/iconfont.css">

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jar/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/nav.js"></script>

</head>
<body>

<div class="nav">
    <div class="nav-top">
        <div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)">
            <img src="${pageContext.request.contextPath}/img/mini.png" ></div>
    </div>
    <ul id="aat">

    </ul>
</div>

<div style="text-align:center;margin:-650px 0; font:normal 14px/24px 'MicroSoft YaHei';">
    <p>适用浏览器：360、FireFox、Chrome、Safari、Opera、傲游、搜狗、世界之窗. 不支持IE8及以下浏览器。</p>
    <p>来源：<a href="http://sc.chinaz.com/" target="_blank">站长素材</a></p>
</div>
<script>
    $(function(){
        var navList = [
            {
                "p" : "银川市",
                "c" : ["兴庆区","金凤区","西夏区","中宁县","灵武市","贺兰县"]
            },
            {
                "p" : "石嘴山市",
                "c" : ["大武口区","惠农区","平罗县"]
            },
            {
                "p" : "吴忠市",
                "c" : ["利通区","红寺堡区","盐池县","同心县","青铜峡市"]
            },
            {
                "p" : "中卫市",
                "c" : ["沙坡头区","中宁县","海原县"]
            },
            {
                "p" : "固原市",
                "c" : ["原州区","泾源县","西吉县","隆德县","彭阳县"]
            }
        ]
        var navData = '';
        for(let i=0;i<navList.length;i++){
            navData+= "<li class='nav-item'><a href='javascript:;'><i class='icon iconfont icon-shezhitubiao1'></i><span>"+navList[i].p+"</span><i class='my-icon nav-more'></i></a><ul>"
            for(let w=0;w<navList[i].c.length;w++){
                navData+="<li><a href='javascript:;'><span>"+navList[i].c[w]+"</span></a></li>"
            }
            navData+="</ul></li>"
        }
        console.log(navData)
        $('#aat').html(navData)
    })
</script>
</body>
</html>
