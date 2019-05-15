package com.yxy.edu.mapper.base;

import com.yxy.edu.model.User;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.mapper
 * @Description: TODO
 * @date Date : 2019年05月15日 10:36
 */
public interface BaseMapper<T> {
    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);

    public void update(T t);

    public void save(T t);
}
