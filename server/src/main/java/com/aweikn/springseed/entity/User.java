package com.aweikn.springseed.entity;

import java.util.Date;

public class User {

    private Integer userId;

    private String  userName;

    private String  userCode;

    private String  userSex;

    private Integer userAgr;

    private String  userPWD;

    private String  userMail;

    private String  lastName;

    private String  fastName;

    private String  partyType;

    private String  partyCode;

    private Date    userCreateDate;

    private Date    userUpdate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAgr() {
        return userAgr;
    }

    public void setUserAgr(Integer userAgr) {
        this.userAgr = userAgr;
    }

    public String getUserPWD() {
        return userPWD;
    }

    public void setUserPWD(String userPWD) {
        this.userPWD = userPWD;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFastName() {
        return fastName;
    }

    public void setFastName(String fastName) {
        this.fastName = fastName;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getPartyCode() {
        return partyCode;
    }

    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }

    public Date getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    public Date getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(Date userUpdate) {
        this.userUpdate = userUpdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAgr=" + userAgr +
                ", userPWD='" + userPWD + '\'' +
                ", userMail='" + userMail + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fastName='" + fastName + '\'' +
                ", partyType='" + partyType + '\'' +
                ", partyCode='" + partyCode + '\'' +
                ", userCreateDate=" + userCreateDate +
                ", userUpdate=" + userUpdate +
                '}';
    }
}
