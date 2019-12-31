package com.wxapp.api.bean;

public class FriendOne {
    private String userNameV1;
    private String origin;
    private String antispamTicket;
    private String wxId;
    private String content;

    public FriendOne( ) {
    }

    public FriendOne(String userNameV1, String origin, String antispamTicket, String wxId, String content) {
        this.userNameV1 = userNameV1;
        this.origin = origin;
        this.antispamTicket = antispamTicket;
        this.wxId = wxId;
        this.content = content;
    }

    public String getUserNameV1() {
        return userNameV1;
    }

    public void setUserNameV1(String userNameV1) {
        this.userNameV1 = userNameV1;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getAntispamTicket() {
        return antispamTicket;
    }

    public void setAntispamTicket(String antispamTicket) {
        this.antispamTicket = antispamTicket;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
