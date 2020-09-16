package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-16 22:22
 **/

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "23a8c1e3bc2742d8848569819fb42181"));
        hashMap.put(2L, new Payment(2L, "bba8c1e3bc2742d8848569819ac32182"));
        hashMap.put(3L, new Payment(3L, "6ua8c1e3bc2742d8848569819xt92183"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200, "from sql,serverport: " + serverPort);
        return result;
    }
}

    