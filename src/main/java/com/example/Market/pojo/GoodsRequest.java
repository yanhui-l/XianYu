package com.example.Market.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsRequest {
    private Integer request_Id;

    private String requestGoodsTitle;

    private String requestGoodsPicture;

    private BigDecimal requestGoodsMoney;

    private Integer requestGoodsCount;

    private Integer requestGoodsType;

    private Date requestGoodsTime;

    public Integer getRequest_Id() {
        return request_Id;
    }

    public void setRequest_Id(Integer request_Id) {
        this.request_Id = request_Id;
    }

    public String getRequestGoodsTitle() {
        return requestGoodsTitle;
    }

    public void setRequestGoodsTitle(String requestGoodsTitle) {
        this.requestGoodsTitle = requestGoodsTitle;
    }

    public String getRequestGoodsPicture() {
        return requestGoodsPicture;
    }

    public void setRequestGoodsPicture(String requestGoodsPicture) {
        this.requestGoodsPicture = requestGoodsPicture;
    }

    public BigDecimal getRequestGoodsMoney() {
        return requestGoodsMoney;
    }

    public void setRequestGoodsMoney(BigDecimal requestGoodsMoney) {
        this.requestGoodsMoney = requestGoodsMoney;
    }

    public Integer getRequestGoodsCount() {
        return requestGoodsCount;
    }

    public void setRequestGoodsCount(Integer requestGoodsCount) {
        this.requestGoodsCount = requestGoodsCount;
    }

    public Integer getRequestGoodsType() {
        return requestGoodsType;
    }

    public void setRequestGoodsType(Integer requestGoodsType) {
        this.requestGoodsType = requestGoodsType;
    }

    public Date getRequestGoodsTime() {
        return requestGoodsTime;
    }

    public void setRequestGoodsTime(Date requestGoodsTime) {
        this.requestGoodsTime = requestGoodsTime;
    }
}