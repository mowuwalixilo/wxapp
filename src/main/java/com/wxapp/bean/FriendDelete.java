package com.wxapp.bean;

import java.util.List;

//批量删除好友使用
public class FriendDelete {
    private List<String> deleteWxIds;
    private String wxId;

    public FriendDelete( ) {
    }

    public FriendDelete(List<String> deleteWxIds, String wxId) {
        this.deleteWxIds = deleteWxIds;
        this.wxId = wxId;
    }

    public List<String> getDeleteWxIds() {
        return deleteWxIds;
    }

    public void setDeleteWxIds(List<String> deleteWxIds) {
        this.deleteWxIds = deleteWxIds;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
