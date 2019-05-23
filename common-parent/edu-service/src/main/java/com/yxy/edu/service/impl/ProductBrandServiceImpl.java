package com.yxy.edu.service.impl;

import com.yxy.edu.mapper.ProductBrandMapper;
import com.yxy.edu.model.ProductBrand;
import com.yxy.edu.service.IProductBrandService;
import com.yxy.edu.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.service.impl
 * @Description: TODO
 * @date Date : 2019年05月22日 17:47
 */
@Service
@Transactional
public class ProductBrandServiceImpl extends BaseServiceImpl<ProductBrand> implements IProductBrandService {
    @Autowired
    private ProductBrandMapper productBrandMapper;
    @Override
    public ProductBrand findById(Integer id) {
        return null;
    }

    @Override
    public ProductBrand findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(ProductBrand productBrand) {

    }

    @Override
    public void save(ProductBrand productBrand) {
        this.productBrandMapper.insert(productBrand);
    }
}
