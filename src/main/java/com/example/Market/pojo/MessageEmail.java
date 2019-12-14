package com.example.Market.pojo;

import java.util.Date;

public class MessageEmail {
    private Integer message_Id;

    private Date dateTime;

    private String emailTitle;

    private String emailContent;

    private Integer sendEmailUser;

    private String emailState;

    private String emailType;

    private Integer goods_iD;

    public Integer getMessage_Id() {
        return message_Id;
    }

    public void setMessage_Id(Integer message_Id) {
        this.message_Id = message_Id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public Integer getSendEmailUser() {
        return sendEmailUser;
    }

    public void setSendEmailUser(Integer sendEmailUser) {
        this.sendEmailUser = sendEmailUser;
    }

    public String getEmailState() {
        return emailState;
    }

    public void setEmailState(String emailState) {
        this.emailState = emailState;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public Integer getGoods_iD() {
        return goods_iD;
    }

    public void setGoods_iD(Integer goods_iD) {
        this.goods_iD = goods_iD;
    }
}