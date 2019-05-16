package com.yxy.edu.service.impl;

import com.yxy.edu.model.User;
import com.yxy.edu.service.IUserService;
import com.yxy.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.service.impl
 * @Description: TODO
 * @date Date : 2019年05月15日 11:04
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Override
    public User login(String userName, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void save(User user) {

    }
}
