package com.catalpa.example.client;

import com.catalpa.example.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wanchuan on 2017/9/27.
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    User findByIdFeign(@RequestParam("id") Long id);
}
