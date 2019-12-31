package com.wxapp.dbbean;


public class TbSysUser {

  private long userId;
  private String userAccount;
  private String userPwd;
  private String userCdkey;
  private String userRole;
  private String userName;
  private String userIsValid;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }


  public String getUserPwd() {
    return userPwd;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }


  public String getUserCdkey() {
    return userCdkey;
  }

  public void setUserCdkey(String userCdkey) {
    this.userCdkey = userCdkey;
  }


  public String getUserRole() {
    return userRole;
  }

  public void setUserRole(String userRole) {
    this.userRole = userRole;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserIsValid() {
    return userIsValid;
  }

  public void setUserIsValid(String userIsValid) {
    this.userIsValid = userIsValid;
  }

}
