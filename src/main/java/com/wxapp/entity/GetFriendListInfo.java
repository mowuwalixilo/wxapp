package com.wxapp.entity;

public class GetFriendListInfo {
    private String wxId;
    private String currentWxcontactSeq;
    private String currentChatRoomContactSeq;

    public GetFriendListInfo( ) {
    }

    public GetFriendListInfo(String wxId, String currentWxcontactSeq, String currentChatRoomContactSeq) {
        this.wxId = wxId;
        this.currentWxcontactSeq = currentWxcontactSeq;
        this.currentChatRoomContactSeq = currentChatRoomContactSeq;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getCurrentWxcontactSeq() {
        return currentWxcontactSeq;
    }

    public void setCurrentWxcontactSeq(String currentWxcontactSeq) {
        this.currentWxcontactSeq = currentWxcontactSeq;
    }

    public String getCurrentChatRoomContactSeq() {
        return currentChatRoomContactSeq;
    }

    public void setCurrentChatRoomContactSeq(String currentChatRoomContactSeq) {
        this.currentChatRoomContactSeq = currentChatRoomContactSeq;
    }
}
