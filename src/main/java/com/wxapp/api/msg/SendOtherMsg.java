package com.wxapp.api.msg;

import com.alibaba.fastjson.JSON;
import com.wxapp.bean.msg.*;
import com.wxapp.util.HttpclientUtil;

/**
 * 发送 App 消息，发送分享消息，发送卡片消息
 * 发送位置消息，发送文件消息，发送xml消息
 */
public class SendOtherMsg {
    /**
     * 发送 App 消息
     * http://47.110.75.232:8080/api/Message/SendAppMessage
     * {
     *   "toWxIds": [
     *     "string"
     *   ],
     *   "appId": "string",
     *   "title": "string",
     *   "desc": "string",
     *   "type": 0,
     *   "showType": 0,
     *   "url": "string",
     *   "dataUrl": "string",
     *   "thumbUrl": "string",
     *   "wxId": "string"
     * }
     */
    public boolean sendAppMessage(AppMsg appMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendAppMessage";
        String sendAppMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(appMsg));
        return (JSON.parseObject(sendAppMessageResult).get("Success")+"").equals("true");
    }

    /**
     * 发送分享消息
     * http://47.110.75.232:8080/api/Message/SendShareMessage
     * {
     *   "toWxIds": [
     *     "string"
     *   ],
     *   "title": "string",
     *   "desc": "string",
     *   "type": 0,
     *   "showType": 0,
     *   "url": "string",
     *   "dataUrl": "string",
     *   "thumbUrl": "string",
     *   "wxId": "string"
     * }
     */
    public boolean sendShareMessage(ShareMsg shareMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendShareMessage";
        String sendShareMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(shareMsg));
        return (JSON.parseObject(sendShareMessageResult).get("Success")+"").equals("true");
    }

    /**
     * 发送卡片消息
     *http://47.110.75.232:8080/api/Message/SendCardMessage
     * {
     *   "toWxIds": [
     *     "string"
     *   ],
     *   "cardWxId": "string",
     *   "cardNickName": "string",
     *   "cardAlias": "string",
     *   "wxId": "string"
     * }
     */
    public boolean sendCardMessage(CardMsg cardMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendCardMessage";
        String sendCardMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(cardMsg));
        return (JSON.parseObject(sendCardMessageResult).get("Success")+"").equals("true");
    }

    /**
     * 发送位置消息
     * http://47.110.75.232:8080/api/Message/SendLocationMessage
     * {
     *   "toWxIds": [
     *     "string"
     *   ],
     *   "longitude": "string",
     *   "latitude": "string",
     *   "name": "string",
     *   "wxId": "string"
     * }
     */
    public boolean sendLocationMessage(LocationMsg locationMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendLocationMessage";
        String sendLocationMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(locationMsg));
        return (JSON.parseObject(sendLocationMessageResult).get("Success")+"").equals("true");
    }

    /**
     * 发送文件消息
     * http://47.110.75.232:8080/api/Message/SendMediaMessage
     * {
     *   "toWxIds": [
     *     "string"
     *   ],
     *   "attachId": "string",
     *   "title": "string",
     *   "length": 0,
     *   "fileExt": "string",
     *   "wxId": "string"
     * }
     */
    public boolean sendMediaMessage(MediaMsg mediaMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendMediaMessage";
        String sendMediaMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(mediaMsg));
        return (JSON.parseObject(sendMediaMessageResult).get("Success")+"").equals("true");
    }

    /**
     *发送 xml 信息
     * http://47.110.75.232:8080/api/Message/SendXmlMessage
     * {
     *   "toWxIds": [
     *     "string"
     *   ],
     *   "xml": "string",
     *   "wxId": "string"
     * }
     */
    public boolean sendXmlMessage(XmlMsg xmlMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendXmlMessage";
        String sendXmlMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(xmlMsg));
        return (JSON.parseObject(sendXmlMessageResult).get("Success")+"").equals("true");
    }
}
