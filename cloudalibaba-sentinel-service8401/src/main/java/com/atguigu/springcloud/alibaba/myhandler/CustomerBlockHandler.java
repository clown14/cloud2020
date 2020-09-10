package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-10 16:32
 **/

public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(4444, "自定义的限流处理信息..CustomerBlockHandler------1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "自定义的限流处理信息..CustomerBlockHandler------2");
    }
}

    