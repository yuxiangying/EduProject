package com.yxy.edu.model;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.ID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.PRODUCTNAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String productname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.BRANDID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String brandid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.CATAGORYID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String catagoryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.PRIORITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.STADARD
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long stadard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.PLACE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String place;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.TEXTURE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String texture;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.UNIT
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.WEIGHT
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.SHOWPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long showprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.MARKETPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long marketprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.COSTPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long costprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.MINPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long minprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.SELLSTARTTIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Date sellstarttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.SELLENDTIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Date sellendtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.KEYWORD
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String keyword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.REMARK
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.THUMBNAILNAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String thumbnailname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.PICTURENAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String picturename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.TOTALQUANTITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long totalquantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.SALEQUANTITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Long salequantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.CREATETIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.UPDATETIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PRODUCT.DETAIL
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    private String detail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.ID
     *
     * @return the value of T_PRODUCT.ID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.ID
     *
     * @param id the value for T_PRODUCT.ID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.PRODUCTNAME
     *
     * @return the value of T_PRODUCT.PRODUCTNAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.PRODUCTNAME
     *
     * @param productname the value for T_PRODUCT.PRODUCTNAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.BRANDID
     *
     * @return the value of T_PRODUCT.BRANDID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getBrandid() {
        return brandid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.BRANDID
     *
     * @param brandid the value for T_PRODUCT.BRANDID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setBrandid(String brandid) {
        this.brandid = brandid == null ? null : brandid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.CATAGORYID
     *
     * @return the value of T_PRODUCT.CATAGORYID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getCatagoryid() {
        return catagoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.CATAGORYID
     *
     * @param catagoryid the value for T_PRODUCT.CATAGORYID
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setCatagoryid(String catagoryid) {
        this.catagoryid = catagoryid == null ? null : catagoryid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.PRIORITY
     *
     * @return the value of T_PRODUCT.PRIORITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.PRIORITY
     *
     * @param priority the value for T_PRODUCT.PRIORITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.STADARD
     *
     * @return the value of T_PRODUCT.STADARD
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getStadard() {
        return stadard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.STADARD
     *
     * @param stadard the value for T_PRODUCT.STADARD
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setStadard(Long stadard) {
        this.stadard = stadard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.PLACE
     *
     * @return the value of T_PRODUCT.PLACE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.PLACE
     *
     * @param place the value for T_PRODUCT.PLACE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.TEXTURE
     *
     * @return the value of T_PRODUCT.TEXTURE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getTexture() {
        return texture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.TEXTURE
     *
     * @param texture the value for T_PRODUCT.TEXTURE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setTexture(String texture) {
        this.texture = texture == null ? null : texture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.UNIT
     *
     * @return the value of T_PRODUCT.UNIT
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.UNIT
     *
     * @param unit the value for T_PRODUCT.UNIT
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.WEIGHT
     *
     * @return the value of T_PRODUCT.WEIGHT
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.WEIGHT
     *
     * @param weight the value for T_PRODUCT.WEIGHT
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.SHOWPRICE
     *
     * @return the value of T_PRODUCT.SHOWPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getShowprice() {
        return showprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.SHOWPRICE
     *
     * @param showprice the value for T_PRODUCT.SHOWPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setShowprice(Long showprice) {
        this.showprice = showprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.MARKETPRICE
     *
     * @return the value of T_PRODUCT.MARKETPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getMarketprice() {
        return marketprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.MARKETPRICE
     *
     * @param marketprice the value for T_PRODUCT.MARKETPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setMarketprice(Long marketprice) {
        this.marketprice = marketprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.COSTPRICE
     *
     * @return the value of T_PRODUCT.COSTPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getCostprice() {
        return costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.COSTPRICE
     *
     * @param costprice the value for T_PRODUCT.COSTPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setCostprice(Long costprice) {
        this.costprice = costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.MINPRICE
     *
     * @return the value of T_PRODUCT.MINPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getMinprice() {
        return minprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.MINPRICE
     *
     * @param minprice the value for T_PRODUCT.MINPRICE
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setMinprice(Long minprice) {
        this.minprice = minprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.SELLSTARTTIME
     *
     * @return the value of T_PRODUCT.SELLSTARTTIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Date getSellstarttime() {
        return sellstarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.SELLSTARTTIME
     *
     * @param sellstarttime the value for T_PRODUCT.SELLSTARTTIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setSellstarttime(Date sellstarttime) {
        this.sellstarttime = sellstarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.SELLENDTIME
     *
     * @return the value of T_PRODUCT.SELLENDTIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Date getSellendtime() {
        return sellendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.SELLENDTIME
     *
     * @param sellendtime the value for T_PRODUCT.SELLENDTIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setSellendtime(Date sellendtime) {
        this.sellendtime = sellendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.KEYWORD
     *
     * @return the value of T_PRODUCT.KEYWORD
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.KEYWORD
     *
     * @param keyword the value for T_PRODUCT.KEYWORD
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.REMARK
     *
     * @return the value of T_PRODUCT.REMARK
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.REMARK
     *
     * @param remark the value for T_PRODUCT.REMARK
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.THUMBNAILNAME
     *
     * @return the value of T_PRODUCT.THUMBNAILNAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getThumbnailname() {
        return thumbnailname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.THUMBNAILNAME
     *
     * @param thumbnailname the value for T_PRODUCT.THUMBNAILNAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setThumbnailname(String thumbnailname) {
        this.thumbnailname = thumbnailname == null ? null : thumbnailname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.PICTURENAME
     *
     * @return the value of T_PRODUCT.PICTURENAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getPicturename() {
        return picturename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.PICTURENAME
     *
     * @param picturename the value for T_PRODUCT.PICTURENAME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setPicturename(String picturename) {
        this.picturename = picturename == null ? null : picturename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.TOTALQUANTITY
     *
     * @return the value of T_PRODUCT.TOTALQUANTITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getTotalquantity() {
        return totalquantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.TOTALQUANTITY
     *
     * @param totalquantity the value for T_PRODUCT.TOTALQUANTITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setTotalquantity(Long totalquantity) {
        this.totalquantity = totalquantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.SALEQUANTITY
     *
     * @return the value of T_PRODUCT.SALEQUANTITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Long getSalequantity() {
        return salequantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.SALEQUANTITY
     *
     * @param salequantity the value for T_PRODUCT.SALEQUANTITY
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setSalequantity(Long salequantity) {
        this.salequantity = salequantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.CREATETIME
     *
     * @return the value of T_PRODUCT.CREATETIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.CREATETIME
     *
     * @param createtime the value for T_PRODUCT.CREATETIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.UPDATETIME
     *
     * @return the value of T_PRODUCT.UPDATETIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.UPDATETIME
     *
     * @param updatetime the value for T_PRODUCT.UPDATETIME
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PRODUCT.DETAIL
     *
     * @return the value of T_PRODUCT.DETAIL
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PRODUCT.DETAIL
     *
     * @param detail the value for T_PRODUCT.DETAIL
     *
     * @mbggenerated Fri May 17 19:13:45 CST 2019
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}