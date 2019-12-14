package com.example.Market.pojo;

import java.util.Date;

public class MyFootPrint {
    private Integer myFootprin_Id;

    private Integer goods_id;

    private Integer user_id;

    private Date dateTime;

    public Integer getMyFootprin_Id() {
        return myFootprin_Id;
    }

    public void setMyFootprin_Id(Integer myFootprin_Id) {
        this.myFootprin_Id = myFootprin_Id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}