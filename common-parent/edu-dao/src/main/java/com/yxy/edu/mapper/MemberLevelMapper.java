package com.yxy.edu.mapper;

import com.yxy.edu.model.MemberLevel;
import com.yxy.edu.model.MemberLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int countByExample(MemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int deleteByExample(MemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int insert(MemberLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int insertSelective(MemberLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    List<MemberLevel> selectByExample(MemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    MemberLevel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") MemberLevel record, @Param("example") MemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int updateByExample(@Param("record") MemberLevel record, @Param("example") MemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int updateByPrimaryKeySelective(MemberLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_LEVEL
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int updateByPrimaryKey(MemberLevel record);
}