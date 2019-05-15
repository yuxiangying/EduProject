function userNameRes() {
    /*if (this.value == '') {
        this.value = '请输入账号/手机号';
        this.className = 'account yh t14';
        this.style.color = '';
    } else {
        this.style.color = '#000000';
    }
    " onfocus="
    if (this.value == this.defaultValue) {
        this.value = '';
        this.className = 'account yh t14';
        this.style.color = '';
    }*/
}

/*
function bluert(){
    this.value = '';
}*/

function onclickLogin() {
    var loginElement = document.getElementById("loginDiv_from");
    loginElement.style.display = "block" //让元素可见
    var loginTitleElement = document.getElementById("loginDiv_title_login");
    loginTitleElement.style.background="#1a77f0";
    var registerElement = document.getElementById("registerDiv_from");
    registerElement.style.display = "none" //让元素隐藏
    var registerTitleElement = document.getElementById("loginDiv_title_register");
    registerTitleElement.style.background="#66a7fb";
}

function onclickRegister() {
    var registerElement = document.getElementById("registerDiv_from");
    registerElement.style.display = "block" //让元素可见
    var registerTitleElement = document.getElementById("loginDiv_title_register");
    registerTitleElement.style.background="#1a77f0";
    var loginElement = document.getElementById("loginDiv_from");
    loginElement.style.display = "none" //让元素隐藏
    var loginTitleElement = document.getElementById("loginDiv_title_login");
    loginTitleElement.style.background = "#66a7fb";
}
