package com.shiqiye.springboot.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ESConfig {
    //@PostConstruct修饰的方法会在服务器加载Servlet的时候运行，类似于Serclet的inti()方法
    @PostConstruct
    public void init(){
        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }
}


