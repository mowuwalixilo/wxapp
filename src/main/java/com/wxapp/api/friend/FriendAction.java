package com.wxapp.api.friend;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wxapp.bean.FriendDelete;
import com.wxapp.bean.FriendList;
import com.wxapp.bean.FriendOne;
import com.wxapp.bean.FriendVerify;
import com.wxapp.entity.GetFriendListInfo;
import com.wxapp.util.HttpclientUtil;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//对列表好友进行的操作，包括添加新好友
@Component
public class FriendAction {

    /**
     获取自己的好友列表的
     {
     "currentWxcontactSeq": 0,
     "currentChatRoomContactSeq": 0,
     "wxId": "wxid_w1cp5s0unh0622"
     }
     返回原始的请求得到的 JSON
     测试成功
     */
    public String getFriendsList(GetFriendListInfo getFriendListInfo){
        String getFriendsListUrl = "http://47.110.75.232:8080/api/Friend/GetContractList";
        String postData = HttpclientUtil.doJSONPost(getFriendsListUrl, JSON.toJSONString(getFriendListInfo));
        return postData;
    }

    //拉取好友列表 测试成功
    public ArrayList<String> getFriendList(JSONObject friendList){
        return JSON.parseObject(JSON.parseObject(friendList.get("Data")+"").get("Contracts")+"",ArrayList.class);
    }

    /**
     * 添加一个好友
     * {
     *   "userNameV1": "string",
     *   "antispamTicket": "string",
     *   "content": "string",
     *   "origin": 0,
     *   "wxId": "string" //自己的微信id
     * }
     * 请求地址：http://47.110.75.232:8080/api/Friend/AddFriendRequest
     * 测试成功
     */
    public String addFriendRequest(FriendOne friendOne){
        if (null == friendOne.getAntispamTicket()){
            return null;
        }
        String url = "http://47.110.75.232:8080/api/Friend/AddFriendRequest";
        String returnMsg = HttpclientUtil.doJSONPost(url,JSON.toJSONString(friendOne));
        return returnMsg;
    }

    /**
     * 搜索联系人
     * 接口地址：http://47.110.75.232:8080/api/Friend/SearchContract/wxid_w1cp5s0unh0622/xzh201224
     * 返回 Data
     * 测试成功
     */
    public String searchContract(String wxId,String searchWxName){
        //http://47.110.75.232:8080/api/Friend/SearchContract/wxid_74a9t8qud45322/18731601858
        String url = "http://47.110.75.232:8080/api/Friend/SearchContract/"+wxId+"/"+searchWxName;
        String userInfo = HttpclientUtil.doPost(url,null);
        try {
            return JSON.parseObject(userInfo).get("Data").toString();
        }catch (Exception e){
            return null;
        }
    }

    //下面三个测试成功
    public String getUserNameV1(JSONObject jsonObject){
        return JSON.parseObject(jsonObject.get("userName")+"").get("string")+"";
    }

    public String getAntispamTicket(JSONObject jsonObject){
        return jsonObject.get("antispamTicket")+"";
    }

    public String getWxId(JSONObject jsonObject){
        return JSON.parseObject(jsonObject.get("pYInitial")+"").get("string")+"";
    }
    /**
     * 批量添加好友
     * 接口地址：http://47.110.75.232:8080/api/Friend/AddFriendRequestList
     * {
     *   "content": "string",
     *   "origin": 0,
     *   "friends": [
     *     {
     *       "userNameV1": "string",
     *       "antispamTicket": "string",
     *       "origin": 0
     *     }
     *   ],
     *   "wxId": "string"
     * }
     * 上面有根据单个好友实现批量添加的方式，这里经过测试待实现
     * 没有足够的微信号进行测试
     */
    public String addFriendRequestList(FriendList friendList){
        String url = "http://47.110.75.232:8080/api/Friend/AddFriendRequestList";
        String addFriendRequestListResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(friendList));
        return addFriendRequestListResult;
    }

    /**
     * 通过好友申请
     * http://47.110.75.232:8080/api/Friend/PassFriendVerify
     * {
     *   "userNameV1": "string",
     *   "antispamTicket": "string",
     *   "content": "string",
     *   "origin": 0,
     *   "wxId": "string"
     * }
     */
    public boolean passFriendVerify(FriendVerify friendVerify){
        String url = "http://47.110.75.232:8080/api/Friend/PassFriendVerify";
        String friendVerifyResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(friendVerify));
        return (JSON.parseObject(friendVerifyResult).get("Success")+"").equals("true");
    }

    /**
     * 拒绝好友申请，和通过好友申请使用的参数一致，但是接口地址不同
     * http://47.110.75.232:8080/api/Friend/RejectFriendVerify
     */
    public boolean rejectFriendVerify(FriendVerify friendVerify){
        String url = "http://47.110.75.232:8080/api/Friend/RejectFriendVerify";
        String friendVerifyResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(friendVerify));
        return (JSON.parseObject(friendVerifyResult).get("Success")+"").equals("true");
    }

    /**
     * 删除好友
     * http://47.110.75.232:8080/api/Friend/DeleteFriend
     */
    public boolean deleteFriend(String toWxId,String wxId){
        String url = "http://47.110.75.232:8080/api/Friend/RejectFriendVerify";
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("toWxId",toWxId);
        dataMap.put("wxId",wxId);
        String deleteFriendResult = HttpclientUtil.doPost(url, dataMap);
        return (JSON.parseObject(deleteFriendResult).get("Success")+"").equals("true");
    }

    /**
     * 批量删除好友
     * http://47.110.75.232:8080/api/Friend/BatchDeleteFriend
     */
    public boolean batchDeleteFriend(FriendDelete friendDelete){
        String url = "http://47.110.75.232:8080/api/Friend/BatchDeleteFriend";
        String batchDeleteFriendResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(friendDelete));
        return (JSON.parseObject(batchDeleteFriendResult).get("Success")+"").equals("true");
    }
}
