package com.atguigu.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-08-21 17:55
 **/

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String get(@PathVariable("id")Integer id) {
        return "nacos, serverPort: " + serverPort + "\t\n\n id: " + id;
    }

}

    