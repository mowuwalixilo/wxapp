package com.wxapp.controller;

import com.alibaba.fastjson.JSON;
import com.wxapp.bean.FriendCircle;
import com.wxapp.bean.FriendList;
import com.wxapp.bean.FriendOne;
import com.wxapp.bean.User;
import com.wxapp.bean.msg.ImageMeg;
import com.wxapp.bean.msg.TextMsg;
import com.wxapp.api.friend.FriendAction;
import com.wxapp.api.friendcycle.FriendCircleApi;
import com.wxapp.api.group.CreateGroup;
import com.wxapp.api.login.A16Login;
import com.wxapp.api.login.Data62Login;
import com.wxapp.api.msg.SendMsg;
import com.wxapp.api.user.UserOperating;
import com.wxapp.entity.A16User;
import com.wxapp.entity.Data62User;
import com.wxapp.entity.GetFriendListInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.wxapp.util.*;
import java.util.List;

@Controller
@RestController
@Api(tags = "主控制器")
//测试 API 使用的控制器
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


    @ApiOperation("SayHello")
    @ApiImplicitParam(name = "str",value = "字段描述",required = true,paramType = "query",dataType = "String")
    @GetMapping("/common/sayHello")
    public String hello(String str) {
        return "ret:" + str;
    }

    //A16登录
    @GetMapping("/Login/A16Login")
    public String a16Login(A16User a16User){
        String loginInfo = a16Login.weixinA16Login(a16User);
        return loginInfo;
    }

    @GetMapping("/Login/Data62Login")
    public String data62Login(Data62User data62User){
        String loginInfo = data62Login.data62Login(data62User);
        return loginInfo;
    }

    //拉取好友列表
    @GetMapping("/Friend/GetContractList")
    public String getContractList(GetFriendListInfo getFriendListInfo){
        String friendsList = friendAction.getFriendsList(getFriendListInfo);
        return friendAction.getFriendList(JSON.parseObject(friendsList)).toString();
    }

    //群发文本消息
    @PostMapping("/Message/SendTxtMessage")
    public String sendTxtMessage(TextMsg textMsg){
        return sendMsg.sendTxtMessage(textMsg);
    }

    //发送图片消息
    @PostMapping("/Message/SendImageMessage")
    public String sendImageMessage(ImageMeg imageMeg){
        return sendMsg.sendImageMessage(imageMeg);
    }

    //获取用户的个人信息
    @GetMapping("/user/get")
    public String getUserInfo(String wxId){
        return userOperating.getUserInfo(wxId);
    }

    //修改头像
    @PostMapping("/user/UploadHeadImage")
    public String uploadHeadImage(String imgUrl,String wxId){
        System.out.println(imgUrl);
        imgUrl = HttpclientUtil.getURLDecoderString(imgUrl);
        String base64 = ImgUtil.getBase64ByImgUrl(imgUrl);
        System.out.println(imgUrl);
        String returnMsg = userOperating.uploadHeadImage(base64, wxId);
        return returnMsg;
    }

    //修改资料
    @PostMapping("/user/UpdateProfile")
    public String updateProfile(User user){
        return userOperating.updateProfile(user);
    }

    //设置微信号
    @GetMapping("/user/SetAlisa")
    public String setAlisa(String alisa,String wxId){
        return userOperating.setAlisa(alisa, wxId);
    }

    //创建群聊
    @GetMapping("/Group/CreateGroup")
    public String createGroup(String groupName, List<String> toWxIds, String wxId){
        if (toWxIds.size() > 40){
            return "请保持群聊人数在40人以内";
        }
        String group = createGroup.createGroup(groupName, toWxIds, wxId);
        return group;
    }

    //发朋友圈
    @PostMapping("/FriendCircle/SendFriendCircle")
    public String sendFriendCircle(FriendCircle friendCircle){
        String status = friendCircleApi.sendFriendCircle(friendCircle);
        return status;
    }

    //批量添加好友
    @PostMapping("/Friend/AddFriendRequestList")
    public String addFriendRequestList(FriendList friendList){
        String addFriendRequestListResult = friendAction.addFriendRequestList(friendList);
        return addFriendRequestListResult;
    }

    //添加单个好友
    @PostMapping("/Friend/AddFriendRequest")
    public String addFriendRequest(FriendOne friendOne){
        String addFriendRequestResult = friendAction.addFriendRequest(friendOne);
        return addFriendRequestResult;
    }

    //搜索联系人
    @GetMapping("/Friend/SearchContract")
    public String searchContract(String wxId,String searchWxName){
        String returnMSg = friendAction.searchContract(wxId,searchWxName);
        return returnMSg;
    }
}
