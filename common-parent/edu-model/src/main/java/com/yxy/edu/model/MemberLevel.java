package com.yxy.edu.model;

import java.util.Date;

public class MemberLevel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_LEVEL.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_LEVEL.LEVELNAME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private String levelname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_LEVEL.REMARK
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_LEVEL.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_LEVEL.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_LEVEL.ID
     *
     * @return the value of T_MEMBER_LEVEL.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_LEVEL.ID
     *
     * @param id the value for T_MEMBER_LEVEL.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_LEVEL.LEVELNAME
     *
     * @return the value of T_MEMBER_LEVEL.LEVELNAME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public String getLevelname() {
        return levelname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_LEVEL.LEVELNAME
     *
     * @param levelname the value for T_MEMBER_LEVEL.LEVELNAME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_LEVEL.REMARK
     *
     * @return the value of T_MEMBER_LEVEL.REMARK
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_LEVEL.REMARK
     *
     * @param remark the value for T_MEMBER_LEVEL.REMARK
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_LEVEL.CREATETIME
     *
     * @return the value of T_MEMBER_LEVEL.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_LEVEL.CREATETIME
     *
     * @param createtime the value for T_MEMBER_LEVEL.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_LEVEL.UPDATETIME
     *
     * @return the value of T_MEMBER_LEVEL.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_LEVEL.UPDATETIME
     *
     * @param updatetime the value for T_MEMBER_LEVEL.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}