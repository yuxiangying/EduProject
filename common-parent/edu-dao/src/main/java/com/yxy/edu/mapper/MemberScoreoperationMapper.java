package com.yxy.edu.mapper;

import com.yxy.edu.model.MemberScoreoperation;
import com.yxy.edu.model.MemberScoreoperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberScoreoperationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int countByExample(MemberScoreoperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int deleteByExample(MemberScoreoperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int insert(MemberScoreoperation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int insertSelective(MemberScoreoperation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    List<MemberScoreoperation> selectByExample(MemberScoreoperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    MemberScoreoperation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") MemberScoreoperation record, @Param("example") MemberScoreoperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int updateByExample(@Param("record") MemberScoreoperation record, @Param("example") MemberScoreoperationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int updateByPrimaryKeySelective(MemberScoreoperation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_MEMBER_SCOREOPERATION
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    int updateByPrimaryKey(MemberScoreoperation record);
}