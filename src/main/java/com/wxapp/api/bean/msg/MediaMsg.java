package com.wxapp.api.bean.msg;

import java.util.List;

/**
 * {
 *   "toWxIds": [
 *     "string"
 *   ],
 *   "attachId": "string",
 *   "title": "string",
 *   "length": 0,
 *   "fileExt": "string",
 *   "wxId": "string"
 * }
 */
public class MediaMsg {
    private List<String> toWxIds;
    private String attachId;
    private String title;
    private String length;
    private String fileExt;
    private String wxId;

    public MediaMsg( ) {
    }

    public MediaMsg(List<String> toWxIds, String attachId, String title, String length, String fileExt, String wxId) {
        this.toWxIds = toWxIds;
        this.attachId = attachId;
        this.title = title;
        this.length = length;
        this.fileExt = fileExt;
        this.wxId = wxId;
    }

    public List<String> getToWxIds() {
        return toWxIds;
    }

    public void setToWxIds(List<String> toWxIds) {
        this.toWxIds = toWxIds;
    }

    public String getAttachId() {
        return attachId;
    }

    public void setAttachId(String attachId) {
        this.attachId = attachId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
