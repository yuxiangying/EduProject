package com.yxy.edu.service.base;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.service.base
 * @Description: TODO
 * @date Date : 2019年05月15日 10:52
 */
public interface IBaseService<T> {
    public T findById(Long id);
    public T findByUUID(String uuid);
    public void deleteById(Long id);
    public void deleteByUUID(String uuid);
    public void update(T t);
    public void save(T t);
}
