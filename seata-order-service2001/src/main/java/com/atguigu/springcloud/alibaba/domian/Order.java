package com.atguigu.springcloud.alibaba.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-18 16:11
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;

    /*
        订单状态： 0：创建中；1：已完成；
     */
    private Integer status;
}



    