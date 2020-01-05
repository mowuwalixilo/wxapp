package com.wxapp.api.friendcycle;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wxapp.bean.FriendCircle;
import com.wxapp.bean.FriendCircleImage;
import com.wxapp.util.HttpclientUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FriendCircleApi {
    /**
     * 获取特定人的朋友圈
     * http://47.110.75.232:8080/api/FriendCircle/GetFriendCircleDetail
     * {
     *   "toWxId": "string",
     *   "maxid": 0,
     *   "wxId": "string"
     * }
     * 测试成功
     */
    public JSONObject getFriendCircleDetail(String toWxId,String maxid,String wxId){
        String url = "http://47.110.75.232:8080/api/FriendCircle/GetFriendCircleDetail";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("toWxId",toWxId);
        dataMap.put("maxid",maxid);
        dataMap.put("wxId",wxId);
        String friendCircleDetail = HttpclientUtil.doPost(url, dataMap);
        return JSON.parseObject(friendCircleDetail);
    }

    /**
     * 获取自己的朋友圈列表
     * http://47.110.75.232:8080/api/FriendCircle/GetFriendCircleList
     * {
     *   "fristPageMd5": "string",
     *   "id": 0,
     *   "wxId": "string"
     * }
     * 测试成功
     */
    public JSONObject getFriendCircleList(String fristPageMd5,String id,String wxId){
        String url = "http://47.110.75.232:8080/api/FriendCircle/GetFriendCircleList";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("fristPageMd5",fristPageMd5);
        dataMap.put("id",id);
        dataMap.put("wxId",wxId);
        String friendCircleList = HttpclientUtil.doPost(url, dataMap);
        return JSON.parseObject(friendCircleList);
    }

    /**
     *同步朋友圈
     * http://47.110.75.232:8080/api/FriendCircle/SyncFriendCircle/{wxId}
     * 未知
     */
    public JSONObject syncFriendCircle(String wxId){
        String url = "http://47.110.75.232:8080/api/FriendCircle/SyncFriendCircle/"+wxId;
        String syncFriendCircleData = HttpclientUtil.doPost(url,null);
        return JSON.parseObject(syncFriendCircleData);
    }

    /**
     * 发送朋友圈
     * http://47.110.75.232:8080/api/FriendCircle/SendFriendCircle
     * {
     *   "type": 0,
     *   "blackList": [
     *     "string"
     *   ],
     *   "withUserList": [
     *     "string"
     *   ],
     *   "mediaInfos": [
     *     {
     *       "url": "string",
     *       "imageUrl": "string",
     *       "width": 0,
     *       "height": 0,
     *       "totalSize": 0
     *     }
     *   ],
     *   "title": "string",
     *   "contentUrl": "string",
     *   "description": "string",
     *   "content": "string",
     *   "wxId": "string"
     * }
     * 有些参数不明白
     */
    public String sendFriendCircle(FriendCircle friendCircle){
        String url = "http://47.110.75.232:8080/api/FriendCircle/SendFriendCircleImage";
        String status = HttpclientUtil.doJSONPost(url, JSON.toJSONString(friendCircle));
        return status;
    }

    /**
     * 上传朋友圈照片
     * http://47.110.75.232:8080/api/FriendCircle/SendFriendCircleImage
     * {
     *   "base64s": [
     *     "string"
     *   ],
     *   "wxId": "string"
     * }
     * 返回成功与否
     * 测试成功
     */
    public boolean sendFriendCircleImage(List<String> base64s,String wxId){
        FriendCircleImage friendCircleImage = new FriendCircleImage(base64s, wxId);
        String url = "http://47.110.75.232:8080/api/FriendCircle/SendFriendCircleImage";
        String status = HttpclientUtil.doJSONPost(url, JSON.toJSONString(friendCircleImage));
        System.out.println(status);
        return (JSON.parseObject(status).get("Success")+"").equals("true");
    }

    /**
     * POST /api/FriendCircle/SetFriendCircle
     * http://47.110.75.232:8080/api/FriendCircle/SetFriendCircle
     * 操作朋友圈 1删除朋友圈2设为隐私3设为公开4删除评论5取消点赞
     *{
     *   "id": 0,
     *   "type": 1,
     *   "wxId": "string"
     * }
     */
    public boolean setFriendCircle(String id,String type,String wxId){
        String url = "http://47.110.75.232:8080/api/FriendCircle/SetFriendCircle";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("id",id);
        dataMap.put("type",type);
        dataMap.put("wxId",wxId);
        String setFriendCircleResult = HttpclientUtil.doPost(url, dataMap);
        return (JSON.parseObject(setFriendCircleResult).get("Success")+"").equals("true");
    }

    /**
     * 发送评论，点赞
     * http://47.110.75.232:8080/api/FriendCircle/SendFriendCircleComment
     {
     "id": "string",
     "type": 0,
     "content": "string",
     "replyCommnetId": 0,
     "wxId": "string"
     }
     */
    public boolean sendFriendCircleComment(String id,String type,String content,String replyCommnetId,String wxId){
        String url = "http://47.110.75.232:8080/api/FriendCircle/SendFriendCircleComment";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("id",id);
        dataMap.put("type",type);
        dataMap.put("content",content);
        dataMap.put("replyCommnetId",replyCommnetId);
        dataMap.put("wxId",wxId);
        String setFriendCircleResult = HttpclientUtil.doPost(url, dataMap);
        return (JSON.parseObject(setFriendCircleResult).get("Success")+"").equals("true");
    }
}









