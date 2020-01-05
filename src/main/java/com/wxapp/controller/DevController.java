package com.wxapp.controller;

import com.wxapp.api.friend.FriendAction;
import com.wxapp.api.login.A16Login;
import com.wxapp.api.login.Data62Login;
import com.wxapp.entity.A16User;
import com.wxapp.entity.Data62User;
import com.wxapp.entity.GetFriendListInfo;
import com.wxapp.task.A16LoginTask;
import com.wxapp.task.Data62LoginTask;
import com.wxapp.task.GetFriendListTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

//开发业务使用的控制器
@RestController
public class DevController {

    //服务类型注入
    @Autowired
    ExecutorService executorService;

    //Api类型注入，多线程传参数
    @Autowired
    A16Login a16Login;
    @Autowired
    Data62Login data62Login;
    @Autowired
    FriendAction friendAction;

    @PostMapping("/app/Login/A16Login")
    public String a16Login(@RequestBody ArrayList<A16User> a16UserList){
        List<Future<String>> futureList = new ArrayList<>();

        System.out.println(a16UserList.size());
        for (A16User a16User : a16UserList) {
            Future<String> submit = executorService.submit(new A16LoginTask(a16Login,a16User));
            futureList.add(submit);
        }

        String returnStr  = getFutureJSON(futureList);
        return returnStr;
    }

    @PostMapping("/app/Login/Data62Login")
    public String data62Login(@RequestBody ArrayList<Data62User> data62UserArrayList){
        List<Future<String>> futureList = new ArrayList<>();
        for (Data62User data62User : data62UserArrayList) {
            Future<String> submit = executorService.submit(new Data62LoginTask(data62Login, data62User));
            futureList.add(submit);
        }

        String returnStr  = getFutureJSON(futureList);
        return returnStr;
    }

    //拉取好友列表
    @PostMapping("/app/Friend/GetContractList")
    public String getContractList(@RequestBody List<GetFriendListInfo> getFriendListInfoList){
        List<Future<String>> futureList = new ArrayList<>();
        for (GetFriendListInfo getFriendListInfo : getFriendListInfoList) {
            Future<String> submit = executorService.submit(new GetFriendListTask(friendAction, getFriendListInfo));
            futureList.add(submit);
        }
        String returnStr = getFutureJSON(futureList);
        return returnStr;
    }

    //获取json串，测试功能
    private String getFutureJSON(List<Future<String>> futureList){
        String returnStr = "[";
        for (Future<String> stringFuture : futureList) {
            try {
                returnStr +=stringFuture.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        returnStr = returnStr.substring(0,returnStr.length()-1)+"]";
        return returnStr;
    }

}


























