package com.yxy.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.web.controller
 * @Description: 产品控制器
 * @date Date : 2019年05月17日 13:52
 */
@Controller
@RequestMapping("product")
public class ProductController {

    /**
     * @Author 余想英
     * @Description:商品首页
     * @Date 13:56 13:56
     * @Param []
     * @return java.lang.String
    **/
    @RequestMapping("home")
    public String home(){
        return "productPage/home";
    }
    /**
     * @Author 余想英
     * @Description:商品首页
     * @Date 13:56 13:56
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("index")
    public String index(){
        return "productPage/index";
    }

    /**
     * @Author 余想英
     * @Description:所有种类鲜花列表
     * @Date 13:56 13:56
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("category")
    public String category(){
        return "productPage/category";
    }
    /**
     * @Author 余想英
     * @Description:主题鲜花列表
     * @Date 13:56 13:56
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("specials")
    public String specials(){
        return "productPage/specials";
    }

    /**
     * @Author 余想英
     * @Description:用户注册
     * @Date 13:56 13:56
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("register")
    public String register(){
        return "productPage/register";
    }

    /**
     * @Author 余想英
     * @Description:鲜花咨讯
     * @Date 13:56 13:56
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("details")
    public String details(){
        return "productPage/details";
    }

    /**
     * @Author 余想英
     * @Description:联系我们
     * @Date 13:56 13:56
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("contact")
    public String contact(){
        return "productPage/contact";
    }

    /**
     * @Author 余想英
     * @Description:
     * @Date 13:56 13:56
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("about")
    public String about(){
        return "productPage/about";
    }


}
