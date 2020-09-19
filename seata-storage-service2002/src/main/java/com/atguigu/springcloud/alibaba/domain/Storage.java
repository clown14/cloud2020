package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-19 13:12
 **/

@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}



    