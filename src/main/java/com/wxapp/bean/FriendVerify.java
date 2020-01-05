package com.wxapp.bean;

//好友验证

/**
 * {
 *   "userNameV1": "string",
 *   "antispamTicket": "string",
 *   "content": "string",
 *   "origin": 0,
 *   "wxId": "string"
 * }
 */
public class FriendVerify {
    private String userNameV1;
    private String antispamTicket;
    private String content;
    private String origin;
    private String wxId;

    public FriendVerify( ) {
    }

    public FriendVerify(String userNameV1, String antispamTicket, String content, String origin, String wxId) {
        this.userNameV1 = userNameV1;
        this.antispamTicket = antispamTicket;
        this.content = content;
        this.origin = origin;
        this.wxId = wxId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
