package com.yxy.edu.mapper;

import com.yxy.edu.model.User;
import com.yxy.edu.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     * @param id
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbggenerated Tue May 21 18:54:49 CST 2019
     */
    int updateByPrimaryKey(User record);

    public User login(User user);
}