package com.yxy.edu.model;

import java.util.Date;

public class MemberScoreoperation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SCOREOPERATION.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SCOREOPERATION.MEMBERID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Long memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SCOREOPERATION.OPERATE
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private String operate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SCOREOPERATION.SCORE
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Long score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SCOREOPERATION.PROFITLOSSSTATUS
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private String profitlossstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SCOREOPERATION.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MEMBER_SCOREOPERATION.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SCOREOPERATION.ID
     *
     * @return the value of T_MEMBER_SCOREOPERATION.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SCOREOPERATION.ID
     *
     * @param id the value for T_MEMBER_SCOREOPERATION.ID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SCOREOPERATION.MEMBERID
     *
     * @return the value of T_MEMBER_SCOREOPERATION.MEMBERID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SCOREOPERATION.MEMBERID
     *
     * @param memberid the value for T_MEMBER_SCOREOPERATION.MEMBERID
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SCOREOPERATION.OPERATE
     *
     * @return the value of T_MEMBER_SCOREOPERATION.OPERATE
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public String getOperate() {
        return operate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SCOREOPERATION.OPERATE
     *
     * @param operate the value for T_MEMBER_SCOREOPERATION.OPERATE
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SCOREOPERATION.SCORE
     *
     * @return the value of T_MEMBER_SCOREOPERATION.SCORE
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Long getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SCOREOPERATION.SCORE
     *
     * @param score the value for T_MEMBER_SCOREOPERATION.SCORE
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SCOREOPERATION.PROFITLOSSSTATUS
     *
     * @return the value of T_MEMBER_SCOREOPERATION.PROFITLOSSSTATUS
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public String getProfitlossstatus() {
        return profitlossstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SCOREOPERATION.PROFITLOSSSTATUS
     *
     * @param profitlossstatus the value for T_MEMBER_SCOREOPERATION.PROFITLOSSSTATUS
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setProfitlossstatus(String profitlossstatus) {
        this.profitlossstatus = profitlossstatus == null ? null : profitlossstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SCOREOPERATION.CREATETIME
     *
     * @return the value of T_MEMBER_SCOREOPERATION.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SCOREOPERATION.CREATETIME
     *
     * @param createtime the value for T_MEMBER_SCOREOPERATION.CREATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MEMBER_SCOREOPERATION.UPDATETIME
     *
     * @return the value of T_MEMBER_SCOREOPERATION.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MEMBER_SCOREOPERATION.UPDATETIME
     *
     * @param updatetime the value for T_MEMBER_SCOREOPERATION.UPDATETIME
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}