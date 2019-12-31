package com.wxapp.api.bean.msg;

import java.util.List;

public class CardMsg {
    private List<String> toWxIds;
    private String cardWxId;
    private String cardNickName;
    private String cardAlias;
    private String wxId;

    public CardMsg( ) {
    }

    public CardMsg(List<String> toWxIds, String cardWxId, String cardNickName, String cardAlias, String wxId) {
        this.toWxIds = toWxIds;
        this.cardWxId = cardWxId;
        this.cardNickName = cardNickName;
        this.cardAlias = cardAlias;
        this.wxId = wxId;
    }

    public List<String> getToWxIds() {
        return toWxIds;
    }

    public void setToWxIds(List<String> toWxIds) {
        this.toWxIds = toWxIds;
    }

    public String getCardWxId() {
        return cardWxId;
    }

    public void setCardWxId(String cardWxId) {
        this.cardWxId = cardWxId;
    }

    public String getCardNickName() {
        return cardNickName;
    }

    public void setCardNickName(String cardNickName) {
        this.cardNickName = cardNickName;
    }

    public String getCardAlias() {
        return cardAlias;
    }

    public void setCardAlias(String cardAlias) {
        this.cardAlias = cardAlias;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
