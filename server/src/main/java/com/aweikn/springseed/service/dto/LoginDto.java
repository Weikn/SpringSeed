package com.aweikn.springseed.service.dto;

import com.aweikn.springseed.entity.User;

public class LoginDto {

    private String msg;

    private String code;

    private String status;

    private User   userInfo;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", userInfo=" + userInfo +
                '}';
    }
}
