package com.wxapp.api.login;

import com.wxapp.api.util.HttpclientUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Data62Login {
    /**
     * http://47.110.75.232:8080/api/Login/Data62Login
     * {
     *   "userName": "string",
     *   "password": "string",
     *   "data62": "string",
     *   "proxyIp": "string",
     *   "proxyUserName": "string",
     *   "proxyPassword": "string"
     * }
     * data62登录
     */
    public String data62Login(String userName,String password,String data62){
        String url = "http://47.110.75.232:8080/api/Login/Data62Login";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("userName",userName);
        dataMap.put("password",password);
        dataMap.put("data62",data62);
        String loginInfo = HttpclientUtil.doPost(url,dataMap);
        return loginInfo;
    }
}
