package com.zmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class test1 {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("test1")
    public String test1(){
        String result = restTemplate.getForObject("http://nacos-provide/helloNacos", String.class);
        return result;
    }
}
