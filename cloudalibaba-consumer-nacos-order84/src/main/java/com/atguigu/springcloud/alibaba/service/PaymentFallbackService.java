package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-17 15:29
 **/

@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(long id) {
        return new CommonResult<>(44444, "服务降级返回，-------PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}

    