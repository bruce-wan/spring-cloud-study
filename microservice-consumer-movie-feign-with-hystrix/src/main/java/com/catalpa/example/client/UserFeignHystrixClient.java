package com.catalpa.example.client;

import com.catalpa.example.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wanchuan on 2017/9/27.
 */
@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)
public interface UserFeignHystrixClient {
    @RequestMapping("/{id}")
    User findByIdFeign(@RequestParam("id") Long id);

}

@Component
class HystrixClientFallback implements UserFeignHystrixClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

    @Override
    public User findByIdFeign(Long id) {
        HystrixClientFallback.LOGGER.info("异常发⽣，进⼊fallback⽅法，接收的参数：id = {}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}