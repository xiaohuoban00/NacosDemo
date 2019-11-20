package com.zmq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosNamespaceOneController {

    @Value("${nacos.config}")
    private String config;

    @GetMapping("getValue")
    public String test(){
        return config;
    }
}
