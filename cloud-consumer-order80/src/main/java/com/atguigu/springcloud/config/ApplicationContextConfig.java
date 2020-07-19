package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-07-18 00:11
 **/

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

    