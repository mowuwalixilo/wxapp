package com.wxapp.api.other;

//消息类型枚举类
public enum  Origin {
    FROM_QQ("1"),FROM_EMAIL("2"),FROM_WEIXIN("3"),FROM_GROUP("14")
    ,FROM_PHONE_NUMBER("15"),FROM_PEOPLE_NEARBY("18"),FROM_DRIFTING_BOTTLE("25")
    ,FROM_SHAKE("29"),FROM_OR_CODE("30"),FROM_ADDRESS_BOOK("10");

    private String type;

    Origin(String s) {
        type = s;
    }

    public String getType() {
        return type;
    }
}
