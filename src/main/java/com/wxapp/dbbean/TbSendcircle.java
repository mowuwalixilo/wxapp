package com.wxapp.dbbean;


public class TbSendcircle {

  private long scId;
  private String scTitle;
  private String scContent;
  private String scPicUrl;
  private long userId;


  public long getScId() {
    return scId;
  }

  public void setScId(long scId) {
    this.scId = scId;
  }


  public String getScTitle() {
    return scTitle;
  }

  public void setScTitle(String scTitle) {
    this.scTitle = scTitle;
  }


  public String getScContent() {
    return scContent;
  }

  public void setScContent(String scContent) {
    this.scContent = scContent;
  }


  public String getScPicUrl() {
    return scPicUrl;
  }

  public void setScPicUrl(String scPicUrl) {
    this.scPicUrl = scPicUrl;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
