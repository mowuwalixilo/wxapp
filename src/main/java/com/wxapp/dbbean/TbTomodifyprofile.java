package com.wxapp.dbbean;


public class TbTomodifyprofile {

  private long mpId;
  private String mpNewPwd;
  private String mpNickname;
  private String mpSignature;
  private String mpAvatarUrl;
  private long userId;


  public long getMpId() {
    return mpId;
  }

  public void setMpId(long mpId) {
    this.mpId = mpId;
  }


  public String getMpNewPwd() {
    return mpNewPwd;
  }

  public void setMpNewPwd(String mpNewPwd) {
    this.mpNewPwd = mpNewPwd;
  }


  public String getMpNickname() {
    return mpNickname;
  }

  public void setMpNickname(String mpNickname) {
    this.mpNickname = mpNickname;
  }


  public String getMpSignature() {
    return mpSignature;
  }

  public void setMpSignature(String mpSignature) {
    this.mpSignature = mpSignature;
  }


  public String getMpAvatarUrl() {
    return mpAvatarUrl;
  }

  public void setMpAvatarUrl(String mpAvatarUrl) {
    this.mpAvatarUrl = mpAvatarUrl;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
