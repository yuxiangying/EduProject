package com.yxy.edu.web.controller;

import com.yxy.edu.model.User;
import com.yxy.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.web.controller
 * @Description: TODO
 * @date Date : 2019年05月15日 10:09
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("..........");
        return "manager/index";
    }

    @RequestMapping("find")
    public String find(Integer id){
        User user = this.userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("article-list")
    public String articlelist(){
        return "manager/article-list";
    }
}
