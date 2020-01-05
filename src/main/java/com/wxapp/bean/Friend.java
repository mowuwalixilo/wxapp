package com.wxapp.bean;

//加好友必须的信息
public class Friend {
     private String userNameV1;
     private String antispamTicket;
     private String origin = "0";

    public Friend() {
    }

    public Friend(String userNameV1, String antispamTicket) {
        this.userNameV1 = userNameV1;
        this.antispamTicket = antispamTicket;
    }

    public Friend(String userNameV1, String antispamTicket, String origin) {
        this.userNameV1 = userNameV1;
        this.antispamTicket = antispamTicket;
        this.origin = origin;
    }

    public String getUserNameV1() {
        return userNameV1;
    }

    public void setUserNameV1(String userNameV1) {
        this.userNameV1 = userNameV1;
    }

    public String getAntispamTicket() {
        return antispamTicket;
    }

    public void setAntispamTicket(String antispamTicket) {
        this.antispamTicket = antispamTicket;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
