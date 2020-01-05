package com.wxapp.bean;

/**
 *   {
 *  *      *       "url": "string",
 *  *      *       "imageUrl": "string",
 *  *      *       "width": 0,
 *  *      *       "height": 0,
 *  *      *       "totalSize": 0
 *  *      *     }
 */
public class MediaInfo {
    private String url;
    private String imageUrl;
    private String width;
    private String height;
    private String totalSize;

    public MediaInfo( ) {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }
}
