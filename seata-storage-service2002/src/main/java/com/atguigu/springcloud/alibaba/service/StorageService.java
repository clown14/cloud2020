package com.atguigu.springcloud.alibaba.service;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-19 13:15
 **/

public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}


