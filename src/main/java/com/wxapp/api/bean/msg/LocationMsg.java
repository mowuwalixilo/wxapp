package com.wxapp.api.bean.msg;

import java.util.List;

/**
 * {
 *   "toWxIds": [
 *     "string"
 *   ],
 *   "longitude": "string",
 *   "latitude": "string",
 *   "name": "string",
 *   "wxId": "string"
 * }
 */
public class LocationMsg {
    private List<String> toWxIds;
    private String longitude;
    private String latitude;
    private String name;
    private String wxId;

    public LocationMsg( ) {
    }

    public LocationMsg(List<String> toWxIds, String longitude, String latitude, String name, String wxId) {
        this.toWxIds = toWxIds;
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
        this.wxId = wxId;
    }

    public List<String> getToWxIds() {
        return toWxIds;
    }

    public void setToWxIds(List<String> toWxIds) {
        this.toWxIds = toWxIds;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
