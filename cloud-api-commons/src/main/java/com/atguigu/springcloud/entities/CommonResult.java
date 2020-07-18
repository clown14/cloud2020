package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-07-16 20:07
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //404
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}

    