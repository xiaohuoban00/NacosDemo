package com.zmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//监听配置文件自动刷新
public class NacosConfigController {

    @Value("${nacos.config}")
    private String config;

    @GetMapping("nacosConfig")
    public String test1(){
        return config;
    }
}
