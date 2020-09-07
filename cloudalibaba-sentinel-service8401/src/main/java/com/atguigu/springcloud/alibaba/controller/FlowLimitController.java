package com.atguigu.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-09-02 16:06
 **/

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "-----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "....testB");
        return "-----testB";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 测试RT");
        return "-----testD";
    }

    @GetMapping("/testC")
    public String testC() {

        log.info("testC 测试异常比例");
        int age = 10 / 0;
        return "-----testC";
    }

    @GetMapping("/testE")
    public String testE() {

        log.info("testC 测试异常数");
        return "-----testE";
    }
}

    