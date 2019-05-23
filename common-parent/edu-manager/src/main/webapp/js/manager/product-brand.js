/*$(document).ready(function() {
    $('#example').dataTable();
} );*/
$('.table-sort').dataTable({
    "aaSorting": [[ 1, "desc" ]],//默认第几个排序
    "bStateSave": true,//状态保存
    "aoColumnDefs": [
        //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
        {"orderable":false,"aTargets":[0,6]}// 制定列不参与排序
    ]/*,
    "ajax": {
        "type": "POST",
        "url":'manager/product/productBrandList',
    },*/
});

/*查询显示产品产地列表*/
$.ajax({
    type:'POST',
    url:'manager/product/productBrandPlaceEnum',
    dataType:'json',
    contentType: 'application/x-www-form-urlencoded;charset=UTF-8',
    data:{},
    success:function (data) {
        $(data).each(
            function () {
                $("#brandPlaceid").append(
                    $("<option/>").text(this.ctlParam).attr("value",this.ctlCode)
                );
            }
        )
    },
    err:function () {
        alert("出错了~~~");
    }
});



// 选择产品品种地址
/*function changebrandPlace() {
    var brandPlaceCode = $("#brandPlaceid option:selected").val();
    $("#brandPlaceCodeHidden").attr("value",brandPlaceCode);
}*/

// 选择logo图片
var imgdata = '';
function changeLogoImage(obj) {
    var f=$(obj).val();
    if(!/\.(?:png|jpg|gif|PNG|JPG|GIF)$/.test(f)){
        alert("类型必须是图片(.png|jpg|gif|PNG|JPG|GIF)");
        $(obj).val('');
        return false;
    }
    imgdata = new FormData();
    $.each($(obj)[0].files,function(i,file){
        imgdata.append('file', file);
    });


}

// 添加品种
var imageurl = "";
function picture_colume_add(obj) {
    var brandName = $("#brandName").val();
    var brandPlaceCode = $("#brandPlaceid option:selected").val();
    imgdata.delete("brandName");
    imgdata.delete("brandPlaceCode");
    imgdata.append("brandName",brandName);
    imgdata.append("brandPlaceCode",brandPlaceCode);
    var file = $("#file-2").val();
    if (file == null || file == "") {
        /*$.messager.alert("提示", "请选择要上传的文件！");*/
        alert("提示", "请选择要上传的文件！");
        return false;
    } else {
        $.ajax({
            type : "post",
            async : false,
            url : "manager/product/addBrand",/*imgdata*/
            data : imgdata,
            cache : false,
            contentType : false, //不可缺
            processData : false, //不可缺,设置为true的时候,ajax提交的时候不会序列化 data，而是直接使用data
            dataType : "json", //返回数据形式为json
            success : function(result) {
                alert(result.msg);
                if(result.code=="0"){
                    $("#brandName").val('');
                    $("#uploadfile-2").val('');
                    $("#brandPlaceid option[value='0']").prop('selected','selected');
                }
            },
            error : function(result) {
                alert("数据请求失败，请联系系统管理员!");
            }
        });
    }
}

