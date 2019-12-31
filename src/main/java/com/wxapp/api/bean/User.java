package com.wxapp.api.bean;

/**
 * 一个用户
 * {
 *   "nickName": "string",
 *   "sex": 0,
 *   "country": "string",
 *   "province": "string",
 *   "city": "string",
 *   "signature": "string",
 *   "wxId": "string"
 * }
 */
public class User {
    private String nickName;
    private String sex;
    private String country;
    private String province;
    private String city;
    private String signature;
    private String wxId;

    public User( ) {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
