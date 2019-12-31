package com.wxapp.controller;

import com.alibaba.fastjson.JSON;
import com.wxapp.api.bean.FriendCircle;
import com.wxapp.api.bean.FriendList;
import com.wxapp.api.bean.FriendOne;
import com.wxapp.api.bean.User;
import com.wxapp.api.bean.msg.ImageMeg;
import com.wxapp.api.bean.msg.TextMsg;
import com.wxapp.api.friend.FriendAction;
import com.wxapp.api.friendcycle.FriendCircleApi;
import com.wxapp.api.group.CreateGroup;
import com.wxapp.api.login.A16Login;
import com.wxapp.api.login.Data62Login;
import com.wxapp.api.msg.SendMsg;
import com.wxapp.api.user.UserOperating;
import com.wxapp.api.util.ImgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class MainController {

    @Autowired
    A16Login a16Login;//a16登录接口
    @Autowired
    Data62Login data62Login;//data62登录接口
    @Autowired
    FriendAction friendAction;//关于好友的一些操作
    @Autowired
    SendMsg sendMsg;//发送消息
    @Autowired
    UserOperating userOperating;//用户个人的一些操作
    @Autowired
    CreateGroup createGroup;//关于群聊的一些操作
    @Autowired
    FriendCircleApi friendCircleApi;//关于朋友圈的一些操作

    //A16登录
    @RequestMapping("/Login/A16Login")
    public String a16Login(String wechatAccount,String wechatPassword,String wechatA16Data){
        String loginInfo = a16Login.weixinA16Login(wechatAccount, wechatPassword, wechatA16Data);
        return loginInfo;
    }

    @RequestMapping("/Login/Data62Login")
    public String data62Login(String userName,String password,String data62){
        String loginInfo = data62Login.data62Login(userName,password,data62);
        return loginInfo;
    }

    //拉取好友列表
    @RequestMapping("/Friend/GetContractList")
    public String getContractList(String wxId,String currentWxcontactSeq,String currentChatRoomContactSeq){
        String friendsList = friendAction.getFriendsList(wxId, currentWxcontactSeq, currentChatRoomContactSeq);
        return friendAction.getFriendList(JSON.parseObject(friendsList)).toString();
    }

    //群发文本消息
    @RequestMapping("/Message/SendTxtMessage")
    public String sendTxtMessage(TextMsg textMsg){
        return sendMsg.sendTxtMessage(textMsg);
    }

    //发送图片消息
    @RequestMapping("/Message/SendImageMessage")
    public String sendImageMessage(ImageMeg imageMeg){
        return sendMsg.sendImageMessage(imageMeg);
    }

    //获取用户的个人信息
    @RequestMapping("/user/get")
    public String getUserInfo(String wxId){
        return userOperating.getUserInfo(wxId);
    }

    //修改头像
    @RequestMapping("/user/UploadHeadImage")
    public String uploadHeadImage(String imgUrl,String wxId){
        String base64 = ImgUtil.getBase64ByImgUrl(imgUrl);
        String returnMsg = userOperating.uploadHeadImage(base64, wxId);
        return returnMsg;
    }

    //修改资料
    @RequestMapping("/user/UpdateProfile")
    public String updateProfile(User user){
        return userOperating.updateProfile(user);
    }

    //设置微信号
    @RequestMapping("/user/SetAlisa")
    public String setAlisa(String alisa,String wxId){
        return userOperating.setAlisa(alisa, wxId);
    }

    //创建群聊
    @RequestMapping("/Group/CreateGroup")
    public String createGroup(String groupName, List<String> toWxIds, String wxId){
        if (toWxIds.size() > 40){
            return "请保持群聊人数在40人以内";
        }
        String group = createGroup.createGroup(groupName, toWxIds, wxId);
        return group;
    }

    //发朋友圈
    @RequestMapping("/FriendCircle/SendFriendCircle")
    public String sendFriendCircle(FriendCircle friendCircle){
        String status = friendCircleApi.sendFriendCircle(friendCircle);
        return status;
    }

    //批量添加好友
    @RequestMapping("/Friend/AddFriendRequestList")
    public String addFriendRequestList(FriendList friendList){
        String addFriendRequestListResult = friendAction.addFriendRequestList(friendList);
        return addFriendRequestListResult;
    }

    //添加单个好友
    @RequestMapping("/Friend/AddFriendRequest")
    public String addFriendRequest(FriendOne friendOne){
        String addFriendRequestResult = friendAction.addFriendRequest(friendOne);
        return addFriendRequestResult;
    }

    //搜索联系人
    @RequestMapping("/Friend/SearchContract")
    public String searchContract(String wxId,String searchWxName){
        String returnMSg = friendAction.searchContract(wxId,searchWxName);
        return returnMSg;
    }
}
