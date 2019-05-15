package com.yxy.edu.service;

import com.yxy.edu.model.User;
import com.yxy.edu.service.base.IBaseService;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.service
 * @Description: TODO
 * @date Date : 2019年05月15日 10:59
 */
public interface IUserService extends IBaseService<User> {
//    特有的方法
    public User login(String userName, String password);
}
