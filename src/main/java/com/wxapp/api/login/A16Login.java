package com.wxapp.api.login;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wxapp.entity.A16User;
import com.wxapp.util.HttpclientUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//微信 A16 登录类
@Component
public class A16Login {

    public String weixinA16Login(A16User a16User){
        String url = "http://47.110.75.232:8080/api/Login/A16Login";
        String loginJson = HttpclientUtil.doJSONPost(url, JSON.toJSONString(a16User));
        return loginJson;
    }

    public String getWeixinId(JSONObject jsonObject){
        Object data = jsonObject.get("Data");
        Object accountInfo = JSON.parseObject(data+"").get("accountInfo");
        return JSONObject.parseObject(accountInfo + "").get("wxid")+"";
    }
}
