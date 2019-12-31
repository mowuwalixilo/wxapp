package com.wxapp.dbbean;


public class TbPhonecontact {

  private long pcId;
  private String phoneNumber;
  private String phoneHasUsed;
  private String phoneMd5;
  private String phoneOwnWxid;
  private String phoneV1;
  private String phoneV2;
  private long userId;


  public long getPcId() {
    return pcId;
  }

  public void setPcId(long pcId) {
    this.pcId = pcId;
  }


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public String getPhoneHasUsed() {
    return phoneHasUsed;
  }

  public void setPhoneHasUsed(String phoneHasUsed) {
    this.phoneHasUsed = phoneHasUsed;
  }


  public String getPhoneMd5() {
    return phoneMd5;
  }

  public void setPhoneMd5(String phoneMd5) {
    this.phoneMd5 = phoneMd5;
  }


  public String getPhoneOwnWxid() {
    return phoneOwnWxid;
  }

  public void setPhoneOwnWxid(String phoneOwnWxid) {
    this.phoneOwnWxid = phoneOwnWxid;
  }


  public String getPhoneV1() {
    return phoneV1;
  }

  public void setPhoneV1(String phoneV1) {
    this.phoneV1 = phoneV1;
  }


  public String getPhoneV2() {
    return phoneV2;
  }

  public void setPhoneV2(String phoneV2) {
    this.phoneV2 = phoneV2;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
