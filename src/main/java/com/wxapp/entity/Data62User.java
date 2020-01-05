package com.wxapp.entity;

import java.io.Serializable;

public class Data62User implements Serializable {
    private String userName;
    private String password;
    private String data62;
    private String proxyIp;
    private String proxyUserName;
    private String proxyPassword;

    public Data62User( ) {
    }

    public Data62User(String userName, String password, String data62, String proxyIp, String proxyUserName, String proxyPassword) {
        this.userName = userName;
        this.password = password;
        this.data62 = data62;
        this.proxyIp = proxyIp;
        this.proxyUserName = proxyUserName;
        this.proxyPassword = proxyPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getData62() {
        return data62;
    }

    public void setData62(String data62) {
        this.data62 = data62;
    }

    public String getProxyIp() {
        return proxyIp;
    }

    public void setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp;
    }

    public String getProxyUserName() {
        return proxyUserName;
    }

    public void setProxyUserName(String proxyUserName) {
        this.proxyUserName = proxyUserName;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }
}
