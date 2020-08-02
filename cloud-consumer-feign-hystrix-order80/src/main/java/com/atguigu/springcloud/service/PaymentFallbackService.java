package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-08-02 17:06
 **/

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back paymentInfo_OK----";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back paymentInfo_TimeOut----";
    }
}

    