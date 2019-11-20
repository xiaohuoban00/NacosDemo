package com.zmq.client.hystrix;

import com.zmq.client.RemoteClient;
import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements RemoteClient {
    public String helloNacos() {
        return "出错了，请稍后再试";
    }
}
