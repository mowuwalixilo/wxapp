package com.wxapp.entity.msg;

import java.util.List;

/**
 * {
 *   "toWxIds": [
 *     "string"
 *   ],
 *   "title": "string",
 *   "desc": "string",
 *   "type": 0,
 *   "showType": 0,
 *   "url": "string",
 *   "dataUrl": "string",
 *   "thumbUrl": "string",
 *   "wxId": "string"
 * }
 */
public class ShareMsg {
    private List<String> toWxIds;
    private String title;
    private String desc;
    private String type;
    private String showType;
    private String url;
    private String dataUrl;
    private String thumbUrl;
    private String wxId;

    public ShareMsg( ) {
    }

    public ShareMsg(List<String> toWxIds, String title, String desc, String type, String showType, String url, String dataUrl, String thumbUrl, String wxId) {
        this.toWxIds = toWxIds;
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.showType = showType;
        this.url = url;
        this.dataUrl = dataUrl;
        this.thumbUrl = thumbUrl;
        this.wxId = wxId;
    }

    public List<String> getToWxIds() {
        return toWxIds;
    }

    public void setToWxIds(List<String> toWxIds) {
        this.toWxIds = toWxIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
