package com.wxapp.bean;

import java.util.List;

/**
 * 朋友圈对象
 *      * {
 *      *   "type": 0,
 *      *   "blackList": [
 *      *     "string"
 *      *   ],
 *      *   "withUserList": [
 *      *     "string"
 *      *   ],
 *      *   "mediaInfos": [
 *      *     {
 *      *       "url": "string",
 *      *       "imageUrl": "string",
 *      *       "width": 0,
 *      *       "height": 0,
 *      *       "totalSize": 0
 *      *     }
 *      *   ],
 *      *   "title": "string",
 *      *   "contentUrl": "string",
 *      *   "description": "string",
 *      *   "content": "string",
 *      *   "wxId": "string"
 *      * }
 */
public class FriendCircle {
    private String type;
    private List<String> blackList;
    private List<String> withUserList;
    private List<MediaInfo> mediaInfos;
    private String title;
    private String contentUrl;
    private String description;
    private String content;
    private String wxId;

    public FriendCircle( ) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public List<String> getWithUserList() {
        return withUserList;
    }

    public void setWithUserList(List<String> withUserList) {
        this.withUserList = withUserList;
    }

    public List<MediaInfo> getMediaInfos() {
        return mediaInfos;
    }

    public void setMediaInfos(List<MediaInfo> mediaInfos) {
        this.mediaInfos = mediaInfos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
