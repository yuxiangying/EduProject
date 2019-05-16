package com.yxy.edu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtlParamExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public CtlParamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCtlTypeIsNull() {
            addCriterion("CTL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCtlTypeIsNotNull() {
            addCriterion("CTL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCtlTypeEqualTo(String value) {
            addCriterion("CTL_TYPE =", value, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeNotEqualTo(String value) {
            addCriterion("CTL_TYPE <>", value, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeGreaterThan(String value) {
            addCriterion("CTL_TYPE >", value, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CTL_TYPE >=", value, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeLessThan(String value) {
            addCriterion("CTL_TYPE <", value, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeLessThanOrEqualTo(String value) {
            addCriterion("CTL_TYPE <=", value, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeLike(String value) {
            addCriterion("CTL_TYPE like", value, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeNotLike(String value) {
            addCriterion("CTL_TYPE not like", value, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeIn(List<String> values) {
            addCriterion("CTL_TYPE in", values, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeNotIn(List<String> values) {
            addCriterion("CTL_TYPE not in", values, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeBetween(String value1, String value2) {
            addCriterion("CTL_TYPE between", value1, value2, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlTypeNotBetween(String value1, String value2) {
            addCriterion("CTL_TYPE not between", value1, value2, "ctlType");
            return (Criteria) this;
        }

        public Criteria andCtlCodeIsNull() {
            addCriterion("CTL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCtlCodeIsNotNull() {
            addCriterion("CTL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCtlCodeEqualTo(String value) {
            addCriterion("CTL_CODE =", value, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeNotEqualTo(String value) {
            addCriterion("CTL_CODE <>", value, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeGreaterThan(String value) {
            addCriterion("CTL_CODE >", value, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CTL_CODE >=", value, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeLessThan(String value) {
            addCriterion("CTL_CODE <", value, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeLessThanOrEqualTo(String value) {
            addCriterion("CTL_CODE <=", value, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeLike(String value) {
            addCriterion("CTL_CODE like", value, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeNotLike(String value) {
            addCriterion("CTL_CODE not like", value, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeIn(List<String> values) {
            addCriterion("CTL_CODE in", values, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeNotIn(List<String> values) {
            addCriterion("CTL_CODE not in", values, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeBetween(String value1, String value2) {
            addCriterion("CTL_CODE between", value1, value2, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlCodeNotBetween(String value1, String value2) {
            addCriterion("CTL_CODE not between", value1, value2, "ctlCode");
            return (Criteria) this;
        }

        public Criteria andCtlParamIsNull() {
            addCriterion("CTL_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andCtlParamIsNotNull() {
            addCriterion("CTL_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andCtlParamEqualTo(String value) {
            addCriterion("CTL_PARAM =", value, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamNotEqualTo(String value) {
            addCriterion("CTL_PARAM <>", value, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamGreaterThan(String value) {
            addCriterion("CTL_PARAM >", value, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamGreaterThanOrEqualTo(String value) {
            addCriterion("CTL_PARAM >=", value, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamLessThan(String value) {
            addCriterion("CTL_PARAM <", value, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamLessThanOrEqualTo(String value) {
            addCriterion("CTL_PARAM <=", value, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamLike(String value) {
            addCriterion("CTL_PARAM like", value, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamNotLike(String value) {
            addCriterion("CTL_PARAM not like", value, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamIn(List<String> values) {
            addCriterion("CTL_PARAM in", values, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamNotIn(List<String> values) {
            addCriterion("CTL_PARAM not in", values, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamBetween(String value1, String value2) {
            addCriterion("CTL_PARAM between", value1, value2, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andCtlParamNotBetween(String value1, String value2) {
            addCriterion("CTL_PARAM not between", value1, value2, "ctlParam");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated do_not_delete_during_merge Thu May 16 18:53:42 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_CTL_PARAM
     *
     * @mbggenerated Thu May 16 18:53:42 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}