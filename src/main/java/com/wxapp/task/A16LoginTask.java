package com.wxapp.task;

import com.wxapp.api.login.A16Login;
import com.wxapp.entity.A16User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.Callable;

public class A16LoginTask implements Callable<String> {

    private A16Login a16Login;
    private A16User a16User;

    public A16LoginTask(A16Login a16Login, A16User a16User) {
        this.a16Login = a16Login;
        this.a16User = a16User;
    }

    @Override
    public String call() throws Exception {
        String a16LoginInfo = a16Login.weixinA16Login(a16User);
        return a16LoginInfo;
    }
}
