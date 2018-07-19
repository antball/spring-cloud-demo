package com.sunvalley.demo.model;


import java.math.BigDecimal;
import java.util.Date;

public class ShopOrder extends BaseModel {
    private Integer userId;

    private String orderNo;

    private Date orderDate;

    private Integer orderStatus;

    private BigDecimal orderTotal;

    private String orderCurrencyCode;

    private Integer totalQtyOrdered;

    private Integer totalItemCount;

    private String orderType;

    private String orderSource;

    private Integer orderEmailFlag;

    private Integer orderUnpayEmailFlag;



    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }



    public String getOrderCurrencyCode() {
        return orderCurrencyCode;
    }

    public void setOrderCurrencyCode(String orderCurrencyCode) {
        this.orderCurrencyCode = orderCurrencyCode == null ? null : orderCurrencyCode.trim();
    }

    public Integer getTotalQtyOrdered() {
        return totalQtyOrdered;
    }

    public void setTotalQtyOrdered(Integer totalQtyOrdered) {
        this.totalQtyOrdered = totalQtyOrdered;
    }

    public Integer getTotalItemCount() {
        return totalItemCount;
    }

    public void setTotalItemCount(Integer totalItemCount) {
        this.totalItemCount = totalItemCount;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public Integer getOrderEmailFlag() {
        return orderEmailFlag;
    }

    public void setOrderEmailFlag(Integer orderEmailFlag) {
        this.orderEmailFlag = orderEmailFlag;
    }

    public Integer getOrderUnpayEmailFlag() {
        return orderUnpayEmailFlag;
    }

    public void setOrderUnpayEmailFlag(Integer orderUnpayEmailFlag) {
        this.orderUnpayEmailFlag = orderUnpayEmailFlag;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}