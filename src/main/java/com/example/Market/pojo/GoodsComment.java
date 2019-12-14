package com.example.Market.pojo;

import java.util.Date;

public class GoodsComment {
    private Integer goodsComment_Id;

    private Integer goods_Id;

    private String comment_Content;

    private Integer goods_UserId;

    private Date dateTime;

    public Integer getGoodsComment_Id() {
        return goodsComment_Id;
    }

    public void setGoodsComment_Id(Integer goodsComment_Id) {
        this.goodsComment_Id = goodsComment_Id;
    }

    public Integer getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(Integer goods_Id) {
        this.goods_Id = goods_Id;
    }

    public String getComment_Content() {
        return comment_Content;
    }

    public void setComment_Content(String comment_Content) {
        this.comment_Content = comment_Content;
    }

    public Integer getGoods_UserId() {
        return goods_UserId;
    }

    public void setGoods_UserId(Integer goods_UserId) {
        this.goods_UserId = goods_UserId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}