package com.wxapp;

import com.wxapp.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Executor;

@SpringBootTest
class WxappApplicationTests {

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    Executor executor;

    @Test
    void contextLoads() {
        System.out.println(executor);
    }

}
