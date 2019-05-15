package com.yxy.edu.service.base;

import com.yxy.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.service.base
 * @Description: TODO
 * @date Date : 2019年05月15日 10:56
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
