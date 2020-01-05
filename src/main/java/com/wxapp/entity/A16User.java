package com.wxapp.entity;

import java.io.Serializable;

public class A16User implements Serializable {
    private String wechatAccount;
    private String wechatPassword;
    private String wechatA16Data;

    public A16User(){}

    public A16User(String wechatAccount, String wechatPassword, String wechatA16Data) {
        this.wechatAccount = wechatAccount;
        this.wechatPassword = wechatPassword;
        this.wechatA16Data = wechatA16Data;
    }

    public String getWechatAccount() {
        return wechatAccount;
    }

    public void setWechatAccount(String wechatAccount) {
        this.wechatAccount = wechatAccount;
    }

    public String getWechatPassword() {
        return wechatPassword;
    }

    public void setWechatPassword(String wechatPassword) {
        this.wechatPassword = wechatPassword;
    }

    public String getWechatA16Data() {
        return wechatA16Data;
    }

    public void setWechatA16Data(String wechatA16Data) {
        this.wechatA16Data = wechatA16Data;
    }
}
