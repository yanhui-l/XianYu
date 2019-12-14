package com.example.Market.pojo;

import java.util.Date;

public class Collect {
    private Integer collect_Id;

    private Integer goods_id;

    private Integer user_id;

    private Date dateTime;

    public Integer getCollect_Id() {
        return collect_Id;
    }

    public void setCollect_Id(Integer collect_Id) {
        this.collect_Id = collect_Id;
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