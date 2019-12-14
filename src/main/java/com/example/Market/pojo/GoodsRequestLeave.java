package com.example.Market.pojo;

import java.util.Date;

public class GoodsRequestLeave {
    private Integer goodsRequestLeave_Id;

    private Date leaveTime;

    private Integer goodsRequest_Id;

    private String leaveContent;

    private Integer user_id;

    public Integer getGoodsRequestLeave_Id() {
        return goodsRequestLeave_Id;
    }

    public void setGoodsRequestLeave_Id(Integer goodsRequestLeave_Id) {
        this.goodsRequestLeave_Id = goodsRequestLeave_Id;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getGoodsRequest_Id() {
        return goodsRequest_Id;
    }

    public void setGoodsRequest_Id(Integer goodsRequest_Id) {
        this.goodsRequest_Id = goodsRequest_Id;
    }

    public String getLeaveContent() {
        return leaveContent;
    }

    public void setLeaveContent(String leaveContent) {
        this.leaveContent = leaveContent;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}