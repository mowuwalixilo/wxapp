package com.wxapp.api.login;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wxapp.api.util.HttpclientUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//微信 A16 登录类
@Component
public class A16Login {

    public String weixinA16Login(String wechatAccount,String wechatPassword,String wechatA16Data){
        String url = "http://47.110.75.232:8080/api/Login/A16Login";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("wechatAccount",wechatAccount);
        dataMap.put("wechatPassword",wechatPassword);
        dataMap.put("wechatA16Data",wechatA16Data);

        String loginJson = HttpclientUtil.doPost(url, dataMap);
        String weixinId = getWeixinId(JSON.parseObject(loginJson));
        dataMap.put("wxid",weixinId);
        loginJson = HttpclientUtil.doPost(url, dataMap);
        return loginJson;
    }

    public String getWeixinId(JSONObject jsonObject){
        Object data = jsonObject.get("Data");
        Object accountInfo = JSON.parseObject(data+"").get("accountInfo");
        return JSONObject.parseObject(accountInfo + "").get("wxid")+"";
    }
}
