package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domian.Order;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-18 16:12
 **/

@Mapper
public interface OrderDao {

    //新建订单
    void create(Order order);

    //修改订单状态 0 -> 1
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}


    