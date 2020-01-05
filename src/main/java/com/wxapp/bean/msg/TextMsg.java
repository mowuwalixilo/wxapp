package com.wxapp.bean.msg;

import java.util.List;

//文本消息类
public class TextMsg {
    private List<String> toWxIds;
    private String content;
    private String wxId;

    public TextMsg( ) {
    }

    public TextMsg(List<String> toWxIds, String content, String wxId) {
        this.toWxIds = toWxIds;
        this.content = content;
        this.wxId = wxId;
    }

    public List<String> getToWxIds() {
        return toWxIds;
    }

    public void setToWxIds(List<String> toWxIds) {
        this.toWxIds = toWxIds;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
