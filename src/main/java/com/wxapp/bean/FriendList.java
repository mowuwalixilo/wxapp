package com.wxapp.bean;

import java.util.List;

//批量加好友使用
public class FriendList {
    /**
     *         dataMap.put("wxId",wxId);
     *         dataMap.put("friends",friends);
     *         dataMap.put("origin",origin);
     */
    private String wxId;
    private String origin;
    private List<Friend> friends;

    public FriendList() {
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }
}
