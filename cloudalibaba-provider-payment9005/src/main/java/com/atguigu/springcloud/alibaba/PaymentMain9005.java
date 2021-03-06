package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-16 22:24
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9005.class, args);
    }
}

    