package com.zmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvideApplication.class);
    }
}
