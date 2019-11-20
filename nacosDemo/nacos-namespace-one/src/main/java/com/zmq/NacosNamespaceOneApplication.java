package com.zmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosNamespaceOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosNamespaceOneApplication.class);
    }
}
