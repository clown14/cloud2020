package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-07-22 00:11
 **/

@RestController
@Slf4j
public class PaymentContorller {

    @Value("${server.port}")
    private String SERVER_PORT;

    @RequestMapping("/payment/consul")
    public String paymentZK() {
        return "springcloud with consul :" + SERVER_PORT + "\t" + UUID.randomUUID().toString();
    }

}

    