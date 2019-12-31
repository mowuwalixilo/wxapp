package com.wxapp.api.bean.msg;


import com.wxapp.api.util.ImgUtil;

import java.util.List;

//图片消息
public class ImageMeg {
    private List<String> toWxIds;
    private String base64;
    private String wxId;

    public ImageMeg( ) {
    }

    public ImageMeg(List<String> toWxIds, String base64, String wxId) {
        this.toWxIds = toWxIds;
        this.base64 = base64;
        this.wxId = wxId;
    }

    public List<String> getToWxIds() {
        return toWxIds;
    }

    public void setToWxIds(List<String> toWxIds) {
        this.toWxIds = toWxIds;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = ImgUtil.getBase64ByImgUrl(base64);
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
