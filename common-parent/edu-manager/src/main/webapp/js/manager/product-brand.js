$(document).ready(function() {
    loadTable();
} );

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
                    // loadTable();
                    window.location.reload();
                }
            },
            error : function(result) {
                alert("数据请求失败，请联系系统管理员!");
            }
        });
    }
}

//加载table数据
function loadTable() {
    var t = $('.table-sort').dataTable({
        "aLengthMenu":[2,3,5,10], //动态指定分页后每页显示的记录数。
        //"searching":false,//禁用搜索
        //"lengthChange":true, //是否启用改变每页显示多少条数据的控件
        "iDisplayLength" : 2,  //默认每页显示多少条记录
        "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "order": [[1, 'asc']],
        /*"aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable":false,"aTargets":[0,6]}// 制定列不参与排序
        ],*/
        "ajax": {
            "type": "POST",
            "url":'manager/product/productBrandList',
        },
        "aoColumns" : [{  //aoColumns设置列时，不可以任意指定列，必须列出所有列。
            "mData" : "id",
            "orderable": false , // 禁用排序
            "sDefaultContent" : "",
            "sWidth" : "4%",
            "render":function(data, type, full, meta){  //render改变该列样式,4个参数，其中参数数量是可变的。
                return	data='<input type="checkbox" value="'+ data + '" name="id"/>';
            }
        },{
            "mData" : null,
            "orderable": false , // 禁用排序
            "sDefaultContent" : "",
            "sWidth" : "4%"
        },{
            "mData" : "id",
            "orderable" : true, // 禁用排序
            "sDefaultContent" : "",
            "sWidth" : "4%",
        },{
            "mData" : "logoname",
            "orderable" : false, // 禁用排序
            "sDefaultContent" : "",
            "sWidth" : "6%",
            'render': function(data, type, row) {
                if(data!=null){
                    img = '<img src="'+data+'" style="max-width:50%;max-height:50%;">';
                    return img;
                }
                return null;
            }
        },{
            "mData" : "brandname",
            "orderable" : false, // 禁用排序
            "sDefaultContent" : "",
            "sWidth" : "8%",
            /*"render":function(data, type, full, meta){  //render改变该列样式,4个参数，其中参数数量是可变的。

            }*/
        },{
            "mData" : "remark",
            "orderable" : false, // 禁用排序
            "sDefaultContent" : "",
            "sWidth" : "15%",
        },{
            "mData" : "id",
            "orderable" : false, // 禁用排序
            "sDefaultContent" : "",
            "sWidth" : "4%",
            "render":function(data, type, full, meta){  //render改变该列样式,4个参数，其中参数数量是可变的。
                return	data='<a style="text-decoration:none" onClick="product_brand_edit('+data+')" ><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="active_del(this,'+data+')" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>';
            }
        }],
        columnDefs: [ {
            targets: [ 2 ],
            orderData: [ 2, 4 ]  //如果第三列进行排序，有相同数据则按照第五列顺序排列
        }]
    });
}

//编辑产品品种
function product_brand_edit(brandId) {
    layer_show("品种编辑","manager/product/brand-edit?brandId="+brandId,"","510");
}
//删除单条产品品种记录
function active_del(obj,brandId) {
    var msg = "您真的确定要删除吗？\n\n请确认！";

    if (confirm(msg)==true){
        $.ajax({
            type:'POST',
            url:'manager/product/deleOneBrand',
            dataType:'json',
            contentType: 'application/x-www-form-urlencoded;charset=UTF-8',
            data:{"brandId": brandId},
            success:function (result) {
                if(result.code=='0'){
                    window.location.reload();
                }else {
                    alet(result.msg);
                }
            },
            err:function () {
                alert("出错了~~~");
            }
        });

    }else{

        return false;

    }
}



