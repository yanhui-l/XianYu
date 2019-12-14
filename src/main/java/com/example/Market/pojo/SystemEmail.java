package com.example.Market.pojo;

import java.util.Date;

public class SystemEmail {
    private Integer systemEmail_Id;

    private Date dateTime;

    private String emailTitle;

    private String emailContent;

    private String sendEmailUser;

    private String emailState;

    public Integer getSystemEmail_Id() {
        return systemEmail_Id;
    }

    public void setSystemEmail_Id(Integer systemEmail_Id) {
        this.systemEmail_Id = systemEmail_Id;
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

    public String getSendEmailUser() {
        return sendEmailUser;
    }

    public void setSendEmailUser(String sendEmailUser) {
        this.sendEmailUser = sendEmailUser;
    }

    public String getEmailState() {
        return emailState;
    }

    public void setEmailState(String emailState) {
        this.emailState = emailState;
    }
}