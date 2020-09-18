package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-18 16:13
 **/

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderDao orderDao;

    @Resource
    StorageService storageService;

    @Resource
    AccountService accountService;

    @Override
    public void create(Order order) {
        log.info("------>开始新建订单");
        orderDao.create(order);

        log.info("------>订单微服务开始调用库存，扣减count");
        storageService.decrease(order.getProductId(), order.getCount());

        log.info("------>订单微服务开始调用库存，扣减end");
        log.info("------>订单微服务开始调用账户，扣减money");
        accountService.decrease(order.getUserId(), order.getMoney());

        log.info("------>订单微服务开始调用账户，扣减end");
        log.info("------>开始修改订单状态");
        orderDao.update(order.getUserId(), 0);

        log.info("------>修改订单状态完毕");
        log.info("------>下单完毕");

    }
}



    