package com.yxy.edu.mapper;

import com.yxy.edu.model.ProductBrand;
import com.yxy.edu.model.ProductBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int countByExample(ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int deleteByExample(ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int insert(ProductBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int insertSelective(ProductBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    List<ProductBrand> selectByExample(ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    ProductBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProductBrand record, @Param("example") ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int updateByExample(@Param("record") ProductBrand record, @Param("example") ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int updateByPrimaryKeySelective(ProductBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PRODUCT_BRAND
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    int updateByPrimaryKey(ProductBrand record);

    List<ProductBrand> selectAll();
}