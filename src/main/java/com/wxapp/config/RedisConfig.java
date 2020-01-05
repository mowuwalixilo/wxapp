package com.wxapp.config;


import com.wxapp.util.RedisUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {

    //读取配置文件中的redis的ip地址
    //@Value("${spring.redis.host}")
    private String host = "127.0.0.1";

    //@Value("${spring.redis.port}")
    private int port = 6379;

    //@Value("${spring.redis.database}")
    private int database = 0;

    //把redisUtil对象返回装配到spring容器里
    @Bean
    public RedisUtil getRedisUtil(){
        if(host.equals("disabled")){
            return null;
        }

        RedisUtil redisUtil=new RedisUtil();
        redisUtil.initPool(host,port,database);
        return redisUtil;
    }

}


