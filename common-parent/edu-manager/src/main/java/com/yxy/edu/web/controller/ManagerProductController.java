package com.yxy.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
