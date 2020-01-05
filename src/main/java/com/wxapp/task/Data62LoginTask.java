package com.wxapp.task;

import com.wxapp.api.login.Data62Login;
import com.wxapp.entity.Data62User;

import java.util.concurrent.Callable;

public class Data62LoginTask implements Callable<String> {

    private Data62Login data62Login;
    private Data62User data62User;

    public Data62LoginTask(Data62Login data62Login, Data62User data62User) {
        this.data62Login = data62Login;
        this.data62User = data62User;
    }

    @Override
    public String call() throws Exception {
        String loginInfo = data62Login.data62Login(data62User);
        return loginInfo;
    }
}
