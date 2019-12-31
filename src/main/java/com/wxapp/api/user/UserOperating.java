package com.wxapp.api.user;

import com.alibaba.fastjson.JSON;
import com.wxapp.api.bean.User;
import com.wxapp.api.util.HttpclientUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//用户的操作
@Component
public class UserOperating {
    /**
     * 获取个人信息
     *http://47.110.75.232:8080/api/user/get
     */
    public String getUserInfo(String wxId){
        String url = "http://47.110.75.232:8080/api/user/get";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("wxId",wxId);
        String userInfo = HttpclientUtil.doPost(url, dataMap);
        return userInfo;
    }

    /**
     * 修改头像
     * http://47.110.75.232:8080/api/user/UploadHeadImage
     * {
     *   "base64": "string",
     *   "wxId": "string"
     * }
     * 测试成功
     */
    public String uploadHeadImage(String base64,String wxId){
        String url = "http://47.110.75.232:8080/api/user/UploadHeadImage";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("base64",base64);
        dataMap.put("wxId",wxId);
        String uploadHeadImageResult = HttpclientUtil.doPost(url, dataMap);
        return uploadHeadImageResult;
    }

    /**
     * 修改资料
     * http://47.110.75.232:8080/api/user/UpdateProfile
     * {
     *   "nickName": "string",
     *   "sex": 0,
     *   "country": "string",
     *   "province": "string",
     *   "city": "string",
     *   "signature": "string",
     *   "wxId": "string"
     * }
     */
    public String updateProfile(User user){
        String url = "http://47.110.75.232:8080/api/user/UpdateProfile";
        String updateProfileResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(user));
        return updateProfileResult;
    }

    /**
     * 设置微信号:/user/SetAlisa
     */
    public String setAlisa(String alisa,String wxId){
        String url = "http://47.110.75.232:8080/api/user/SetAlisa";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("alisa",alisa);
        dataMap.put("wxId",wxId);
        String setAlisaResult = HttpclientUtil.doPost(url, dataMap);
        return setAlisaResult;
    }
}
