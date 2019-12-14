package com.example.Market.pojo;

import java.util.Date;

public class GoodsCommentReply {
    private Integer goodsCommentReply_Id;

    private Integer goods_Id;

    private String comment_Content;

    private Integer goods_UserId;

    private Integer goods_UserId2;

    private Date dateTime;

    public Integer getGoodsCommentReply_Id() {
        return goodsCommentReply_Id;
    }

    public void setGoodsCommentReply_Id(Integer goodsCommentReply_Id) {
        this.goodsCommentReply_Id = goodsCommentReply_Id;
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

    public Integer getGoods_UserId2() {
        return goods_UserId2;
    }

    public void setGoods_UserId2(Integer goods_UserId2) {
        this.goods_UserId2 = goods_UserId2;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}