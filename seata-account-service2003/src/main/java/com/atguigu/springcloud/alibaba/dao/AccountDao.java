package com.atguigu.springcloud.alibaba.dao;

import feign.Param;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-19 13:29
 **/

@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}



    