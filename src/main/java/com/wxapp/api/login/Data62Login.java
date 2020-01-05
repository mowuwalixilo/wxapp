package com.wxapp.api.login;

import com.alibaba.fastjson.JSON;
import com.wxapp.entity.Data62User;
import com.wxapp.util.HttpclientUtil;
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
    public String data62Login(Data62User data62User){
        String url = "http://47.110.75.232:8080/api/Login/Data62Login";
        String loginInfo = HttpclientUtil.doJSONPost(url, JSON.toJSONString(data62User));
        return loginInfo;
    }
}
