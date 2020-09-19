package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.domian.CommonResult;
import com.atguigu.springcloud.alibaba.domian.Order;
import com.atguigu.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-18 16:15
 **/

@RestController
public class OrderController
{
    @Resource
    OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}



    