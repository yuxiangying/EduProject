package com.yxy.edu.web.controller;

import com.yxy.edu.model.CtlParam;
import com.yxy.edu.model.ProductBrand;
import com.yxy.edu.service.ICtlParamService;
import com.yxy.edu.service.IProductBrandService;
import com.yxy.edu.web.utils.Result;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.*;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.web.controller
 * @Description: TODO
 * @date Date : 2019年05月17日 17:24
 */
@Controller
@RequestMapping("manager/product")
public class ManagerProductController {

    @Resource
    private ICtlParamService ctlParamService;
    @Resource
    private IProductBrandService productBrandService;
    /**
     * @Author 余想英
     * @Description:品种管理
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
    **/
    @RequestMapping("brand")
    public String brand(){
        System.out.println("..........");
        return "managerPage/product-brand";
    }

    /**
     * @Author 余想英
     * @Description:品种编辑
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("brand-edit")
    public String brandEdit(@RequestParam String brandId,
                            HttpServletRequest request,HttpServletResponse response){
        List<CtlParam> brandPlaces = this.ctlParamService.selectByType("productBrandPlace");
        request.setAttribute("brandPlaces",brandPlaces);
        ProductBrand productBrand = this.productBrandService.findById(Long.parseLong(brandId));
        if(productBrand!=null){
            request.setAttribute("productBrand",productBrand);
        }
        System.out.println("..........");
        return "managerPage/product-brand-edit";
    }
    /**
     * @Author 余想英
     * @Description:分类管理
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("category")
    public String category(){
        System.out.println("..........");
        return "managerPage/product-category";
    }
    /**
     * @Author 余想英
     * @Description:产品管理
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("list")
    public String list(){
        System.out.println("..........");
        return "managerPage/product-list";
    }
    /**
     * @Author 余想英
     * @Description:产品管理
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("category-add")
    public String categoryDdd(){
        System.out.println("..........");
        return "managerPage/product-category-add";
    }

    /**
     * @Author 余想英
     * @Description:产品管理
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("add")
    public String add(){
        System.out.println("..........");
        return "managerPage/product-add";
    }

    /**
     * @Author 余想英
     * @Description:产品产地枚举
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("productBrandPlaceEnum")
    @ResponseBody
    public List<CtlParam> productBrandPlaceEnum(){
        List<CtlParam> ctlParams = this.ctlParamService.selectByType("productBrandPlace");
        return ctlParams;
    }

    @RequestMapping("addBrand")
    @ResponseBody
    public Result addBrand(@RequestParam(value = "file", required = false) MultipartFile file,
                           @RequestParam(value = "brandName", required = false) String brandName,
                           @RequestParam(value = "brandPlaceCode", required = false) String brandPlaceCode,
                           HttpServletRequest request, HttpServletResponse response){
       /* String brandName = request.getParameter("brandName");
        String brandPlaceCode = request.getParameter("brandPlaceCodeHidden");*/
        JSONObject obj = new JSONObject();
        File targetFile = null;
        String url = "";// 返回存储路径
        String fileName = file.getOriginalFilename();// 获取文件名加后缀
        if (fileName != null && fileName != "") {
            //文件存储位置
            ServletContext scontext = request.getSession().getServletContext();
            // 获取绝对路径
            String path = scontext.getRealPath("")+"img" +File.separator + "uploadFiles"+File.separator+"brandLogo";
            String lastname = fileName.substring(fileName.lastIndexOf("."), fileName.length());//文件后缀
            //fileName = new Date().getTime() + "_" + new Random().nextInt(1000) + lastname;
            fileName = new Date().getTime() + "_" + brandName + lastname;//当前时间+随机数=新的文件名
            // 如果文件夹不存在则创建
            File pathfile = new File(path);
            if (!pathfile.exists()) {
                pathfile.mkdirs();
            }
            // 将图片存入文件夹
            targetFile = new File(path, fileName);
            try {
                // 将上传的文件写到服务器上指定的文件。
                file.transferTo(targetFile);
                url = "img"+ File.separator + "uploadFiles" + File.separator + "brandLogo" + File.separator + fileName;//保存路径，便于后续存入数据库
                //插入产品种类数据
                ProductBrand productBrand = new ProductBrand();
                productBrand.setBrandname(brandName);
                productBrand.setPlace(brandPlaceCode);
                productBrand.setLogoname(url);
                productBrand.setCreatetime(new Date());
                this.productBrandService.save(productBrand);

                return Result.success(0,"添加成功！");
            } catch (Exception e) {
                e.printStackTrace();
                return Result.error(1,"添加失败！");
            }
        }
        return Result.success(0,"添加成功！");

    }

    /**
     * @Author 余想英
     * @Description:产品品牌列表
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("productBrandList")
    @ResponseBody
    public Map<String, Object> productBrands(){
        Map<String, Object> map = new HashMap<String, Object>();
        int count=0;
        List<ProductBrand> productBrands = new ArrayList<ProductBrand>();
        productBrands = this.productBrandService.selectAll();
        if(productBrands!=null && productBrands.size()>0){
            count = productBrands.size();
        }
        map.put("recordsTotal", count);
        map.put("recordsFiltered", count);
        map.put("aaData", productBrands);
        return map;

    }

    /**
     * @Author 余想英
     * @Description:产品品牌列表
     * @Date 17:27 17:27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("deleOneBrand")
    @ResponseBody
    public Result deleOneBrand(@RequestParam String brandId){
        try {
            this.productBrandService.deleteById(Long.parseLong(brandId));
            return Result.success(0,"操作成功！");
        }catch (Exception e){
            return Result.error(1,"数据异常");
        }
    }

}
