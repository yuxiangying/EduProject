package com.yxy.edu.model;

import java.util.Date;

public class MemberShare {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SHARE.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SHARE.MEMBERID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Long memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SHARE.PRODUCTID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Long productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SHARE.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SHARE.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SHARE.ID
     *
     * @return the value of T_MEMBER_SHARE.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SHARE.ID
     *
     * @param id the value for T_MEMBER_SHARE.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SHARE.MEMBERID
     *
     * @return the value of T_MEMBER_SHARE.MEMBERID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SHARE.MEMBERID
     *
     * @param memberid the value for T_MEMBER_SHARE.MEMBERID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SHARE.PRODUCTID
     *
     * @return the value of T_MEMBER_SHARE.PRODUCTID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Long getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SHARE.PRODUCTID
     *
     * @param productid the value for T_MEMBER_SHARE.PRODUCTID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setProductid(Long productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SHARE.CREATETIME
     *
     * @return the value of T_MEMBER_SHARE.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SHARE.CREATETIME
     *
     * @param createtime the value for T_MEMBER_SHARE.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SHARE.UPDATETIME
     *
     * @return the value of T_MEMBER_SHARE.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SHARE.UPDATETIME
     *
     * @param updatetime the value for T_MEMBER_SHARE.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}