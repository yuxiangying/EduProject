package com.yxy.edu.service;

import com.yxy.edu.model.CtlParam;
import com.yxy.edu.service.base.IBaseService;

import java.util.List;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.service
 * @Description: TODO
 * @date Date : 2019年05月22日 14:50
 */
public interface ICtlParamService extends IBaseService<CtlParam> {

    public List<CtlParam> selectByType(String ctlType);
}
