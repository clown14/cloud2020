package com.atguigu.springcloud.alibaba.dao;

import feign.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-19 13:13
 **/

@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}



    