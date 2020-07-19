package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-07-16 20:30
 **/


public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}

