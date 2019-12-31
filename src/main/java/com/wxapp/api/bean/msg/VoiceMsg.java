package com.wxapp.api.bean.msg;

import java.util.List;

//语音消息类
public class VoiceMsg {
    private List<String> toWxIds;
    private String voiceSecond;
    private String base64;
    private String fileName;
    private String wxId;

    public VoiceMsg( ) {
    }

    public List<String> getToWxIds() {
        return toWxIds;
    }

    public void setToWxIds(List<String> toWxIds) {
        this.toWxIds = toWxIds;
    }

    public String getVoiceSecond() {
        return voiceSecond;
    }

    public void setVoiceSecond(String voiceSecond) {
        this.voiceSecond = voiceSecond;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
