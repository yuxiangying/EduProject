package com.yxy.edu.web.controller;

import com.yxy.edu.model.User;
import com.yxy.edu.service.IUserService;
import com.yxy.edu.web.utils.RandomValidateCode;
import com.yxy.edu.web.utils.Result;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.web.controller
 * @Description: TODO
 * @date Date : 2019年05月20日 10:35
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @Resource
    private IUserService userService;
//   private static Logger logger = (Logger) LoggerFactory.getLogger(LoginCtrl.class);
    /**
     * @Author 余想英
     * @Description:生成验证码
     * @Date 10:46 10:46
     * @Param
     * @return
     */
    @RequestMapping("checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");

        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);

        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandCode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Author 余想英
     * @Description:用户登录验证
     * @Date 10:49 10:49
     * @Param
     * @return
     */
    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public Result userLogin(HttpServletRequest request, HttpServletResponse response,
                            @RequestParam String userName,
                            @RequestParam String password,
                            @RequestParam String verifyCode){
        HttpSession session = request.getSession();
        /*String userName = request.getParameter("loginname");
        String password = request.getParameter("password");
        String verifyCode= request.getParameter("verifyCode");*/
        String sessionVerifyCode = (String) session.getAttribute(RandomValidateCode.RANDOMCODEKEY);
        if(!verifyCode.equalsIgnoreCase(sessionVerifyCode)){
//            logger.info("<--登录失败,验证码输入有误！-->");
            return Result.error(1,"验证码错误！");
        }else{
            User userTemp = new User();
            userTemp.setUsercode(userName);
            userTemp.setPassword(password);
            User user = userService.login(userTemp);
            if(user!=null){
                session.removeAttribute("UserInfo");
                session.setAttribute("UserInfo",user);
                return Result.success(3,"登录成功！");
            }else {
                return Result.error(2,"用户名或密码错误");
            }

        }

    }

    @RequestMapping("/checkUserRole")
    public String checkUserRole(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        User userInfo = (User) session.getAttribute("UserInfo");
        if("manager".equals(userInfo.getRole())){
            return "managerPage/index";
        }else{
            return "productPage/index";
        }
    }


}
