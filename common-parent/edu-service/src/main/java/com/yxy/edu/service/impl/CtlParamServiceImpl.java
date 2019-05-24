package com.yxy.edu.service.impl;

import com.yxy.edu.mapper.CtlParamMapper;
import com.yxy.edu.model.CtlParam;
import com.yxy.edu.service.ICtlParamService;
import com.yxy.edu.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.service.impl
 * @Description: TODO
 * @date Date : 2019年05月22日 14:57
 */
@Service
@Transactional
public class CtlParamServiceImpl extends BaseServiceImpl<CtlParam> implements ICtlParamService {
    @Autowired
    private CtlParamMapper ctlParamMapper;

    @Override
    public List<CtlParam> selectByType(String ctlType) {
        return ctlParamMapper.selectByType(ctlType);
    }

    @Override
    public CtlParam findById(Long id) {
        return null;
    }

    @Override
    public CtlParam findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(CtlParam ctlParam) {

    }

    @Override
    public void save(CtlParam ctlParam) {

    }
}
