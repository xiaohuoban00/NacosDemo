package com.zmq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//相当于@ResponseBody ＋ @Controller合在一起的作用
public class helloNacos {
    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好,Nacos";
    }
}
