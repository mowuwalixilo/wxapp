package com.wxapp.api.group;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wxapp.api.util.HttpclientUtil;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//创建群的操作
@Component
public class CreateGroup {
    /**
     * 请求参数
     * {
     *   "groupName": "string",
     *   "toWxIds": [
     *     "string"
     *   ],
     *   "wxId": "string"
     * }
     * 接口地址：http://47.110.75.232:8080/api/Group/CreateGroup
     * 请求方式：POST
     * 返回是否创建群成功
     */
    public String createGroup(String groupName, List<String> toWxIds,String wxId){
        String url = "http://47.110.75.232:8080/api/Group/CreateGroup";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("groupName",groupName);
        dataMap.put("toWxIds",toWxIds+"");
        dataMap.put("wxId",wxId);
        String returnMsg = HttpclientUtil.doPost(url,dataMap);
        return returnMsg;
    }

    //通过微信好友的名字来创建群，wxId自动获取
    public String createGroup(String groupName, String wxId,List<String> names){
        String url = "http://47.110.75.232:8080/api/Group/CreateGroup";
        Map<String,String> dataMap = new HashMap<>();
        List<String> toWxIds = new ArrayList<>();
        for (String name : names) {
            String wxId1 = getWxId(wxId, name);
            if (null != wxId){
                toWxIds.add(wxId1);
            }
        }
        return createGroup(groupName,toWxIds,wxId);
    }

    /**
     * 邀请新成员,请求数据如下
     * {
     *   "chatRoomName": "string",
     *   "toWxIds": [
     *     "string"
     *   ],
     *   "wxId": "string"
     * }
     * 接口地址：http://47.110.75.232:8080/api/Group/AddGroupMember
     * 返回是否邀请成功
     */
    public boolean addGroupMember(String groupName, List<String> toWxIds,String wxId){
        String url = "http://47.110.75.232:8080/api/Group/CreateGroup";
        Map<String,String> dataMap = new HashMap<>();

        dataMap.put("groupName",groupName);
        dataMap.put("toWxIds",toWxIds+"");
        dataMap.put("wxId",wxId);
        String returnMsg = HttpclientUtil.doPost(url,dataMap);
        return (JSON.parseObject(returnMsg).get("Success")+"").equals("true");
    }


    public String getWxId(String wxId,String searchWxName){
        String url = "http://47.110.75.232:8080/api/Friend/SearchContract/"+wxId+"/"+searchWxName;
        String userInfo = HttpclientUtil.doPost(url,null);
        System.out.println(userInfo);
        try {
            JSONObject data = JSON.parseObject(JSON.parseObject(userInfo).get("Data") + "");
            return JSON.parseObject(data.get("pYInitial")+"").get("string")+"";
        }catch (Exception e){
            return null;
        }
    }
}
