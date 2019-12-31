package com.wxapp.api.bean;

import java.util.List;

//朋友圈图片
public class FriendCircleImage {
    List<String> base64s;
    String wxId;

    public FriendCircleImage() {
    }

    public FriendCircleImage(List<String> base64s, String wxId) {
        this.base64s = base64s;
        this.wxId = wxId;
    }

    public List<String> getBase64s() {
        return base64s;
    }

    public void setBase64s(List<String> base64s) {
        this.base64s = base64s;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
