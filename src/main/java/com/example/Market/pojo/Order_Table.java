package com.example.Market.pojo;

import java.util.Date;

public class Order_Table {
    private Integer order_Id;

    private Integer order_GoodId;

    private Integer order_userId;

    private Date dateTime;

    private String order_state;

    private String order_new;

    public Integer getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(Integer order_Id) {
        this.order_Id = order_Id;
    }

    public Integer getOrder_GoodId() {
        return order_GoodId;
    }

    public void setOrder_GoodId(Integer order_GoodId) {
        this.order_GoodId = order_GoodId;
    }

    public Integer getOrder_userId() {
        return order_userId;
    }

    public void setOrder_userId(Integer order_userId) {
        this.order_userId = order_userId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public String getOrder_new() {
        return order_new;
    }

    public void setOrder_new(String order_new) {
        this.order_new = order_new;
    }
}