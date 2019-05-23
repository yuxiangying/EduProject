//提交
$('#login').click(function () {
    $("#err").empty();
    var userName = $('#userName').val();
    var password = $('#password').val();
    var verifyCode = $('#verifyCode').val();
    $.ajax({
        type:'post',
        url:'login/userLogin',
        dataType:'json',
        contentType: 'application/x-www-form-urlencoded;charset=UTF-8',//此类型是可以参数接受
        data:{userName: userName, password: password,verifyCode : verifyCode},
        success:function(data){
            if(data.code=="1"){
                getVerifyCode();
                $("#err").empty();
                $("#err").append(data.msg);
            }else if(data.code=="2"){
                getVerifyCode();
                /*$('#password').val()=='密码';*/
                $("#err").empty();
                $("#err").append(data.msg);
            }else{
                window.top.location.href='login/checkUserRole';
            }
        },
        error:function(){
            alert('服务繁忙,请稍后再试');
            getVerifyCode();
        }
    });
});

//获取验证码
function getVerifyCode() {
    //不加时间戳就永远是一样的，因为路径一样,所以在路径下加入时间戳
    $("#captchaImg").attr("src","login/checkCode?"+new Date().getTime()).fadeIn();
}

