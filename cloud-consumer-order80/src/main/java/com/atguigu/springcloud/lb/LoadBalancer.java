package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: cloud2020
 * @author: onion
 * @create: 2020-07-29 15:54
 **/

public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
