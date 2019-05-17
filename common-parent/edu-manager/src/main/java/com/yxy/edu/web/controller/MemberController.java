package com.yxy.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.web.controller.manager
 * @Description: 会员管理控制器
 * @date Date : 2019年05月16日 16:29
 */
@Controller
@RequestMapping("member")
public class MemberController {

    /**
     * @Author 余想英
     * @Description:获取会员列表
     * @Date 16:31 16:31
     * @Param []
     * @return java.lang.String
    **/
    @RequestMapping("list")
    public String list(){
        System.out.println("..........");
        return "managerPage/member-list";
    }

    /*
     * @Author 余想英
     * @Description:获取删除的会员列表
     * @Date 16:34 16:34
     * @Param []
     * @return java.lang.String
    **/
    @RequestMapping("del")
    public String del(){
        System.out.println("..........");
        return "managerPage/member-del";
    }
    /*
     * @Author 余想英
     * @Description:会员等级管理
     * @Date 16:34 16:34
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("level")
    public String level(){
        System.out.println("..........");
        return "managerPage/member-level";
    }

    /*
     * @Author 余想英
     * @Description:会员积分管理
     * @Date 16:34 16:34
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("scoreoperation")
    public String scoreoperation(){
        System.out.println("..........");
        return "managerPage/member-scoreoperation";
    }

    /*
     * @Author 余想英
     * @Description:会员浏览记录
     * @Date 16:34 16:34
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("record-browse")
    public String recordBrowse(){
        System.out.println("..........");
        return "managerPage/member-record-browse";
    }

    /*
     * @Author 余想英
     * @Description:会员下载记录
     * @Date 16:34 16:34
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("record-download")
    public String recordDownload(){
        System.out.println("..........");
        return "managerPage/member-record-download";
    }

    /*
     * @Author 余想英
     * @Description:会员分享记录
     * @Date 16:34 16:34
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("record-share")
    public String recordShare(){
        System.out.println("..........");
        return "managerPage/member-record-share";
    }

}
