package com.wxapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ConcurrentConfig {

    @Value("${the-most-thread-numbers}")
    private int theMostThreadNum;
    @Bean
    public ExecutorService executorPool(){
        return Executors.newFixedThreadPool(theMostThreadNum);
    }

}
