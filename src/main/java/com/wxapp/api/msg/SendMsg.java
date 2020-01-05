package com.wxapp.api.msg;

import com.alibaba.fastjson.JSON;
import com.wxapp.bean.msg.ImageMeg;
import com.wxapp.bean.msg.TextMsg;
import com.wxapp.bean.msg.VideoMsg;
import com.wxapp.bean.msg.VoiceMsg;
import com.wxapp.util.HttpclientUtil;
import org.springframework.stereotype.Component;

/**
 * 发送文本，语音，图片，视频
 * 这个类里封装了几个简单的操作
 */
@Component
public class SendMsg {
    /**
     * http://47.110.75.232:8080/api/Message/SendTxtMessage
     * 发送文本消息
     */
    public String sendTxtMessage(TextMsg textMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendTxtMessage";
        String sendTxtMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(textMsg));
        return sendTxtMessageResult;
    }

    /**
     * http://47.110.75.232:8080/api/Message/SendVoiceMessage
     * 发送语音消息
     */
    public String sendVoiceMessage(VoiceMsg voiceMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendVoiceMessage";
        String sendVoiceMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(voiceMsg));
        return sendVoiceMessageResult;
    }

    /**
     * http://47.110.75.232:8080/api/Message/SendImageMessage
     * 发送图片消息
     */
    public String sendImageMessage(ImageMeg imageMeg){
        String url = "http://47.110.75.232:8080/api/Message/SendImageMessage";
        String sendImageMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(imageMeg));
        return sendImageMessageResult;
    }

    /**
     * http://47.110.75.232:8080/api/Message/SendVideoMessage
     * 发送视频消息
     */
    public String sendVideoMessage(VideoMsg videoMsg){
        String url = "http://47.110.75.232:8080/api/Message/SendVideoMessage";
        String sendVideoMessageResult = HttpclientUtil.doJSONPost(url, JSON.toJSONString(videoMsg));
        return sendVideoMessageResult;
    }
}
