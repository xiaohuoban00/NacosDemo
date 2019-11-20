package com.zmq.client;

import com.zmq.client.hystrix.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nacos-provide",fallback = RemoteHystrix.class)
@Component
public interface RemoteClient {
    @GetMapping("/helloNacos")
    String helloNacos();
}
