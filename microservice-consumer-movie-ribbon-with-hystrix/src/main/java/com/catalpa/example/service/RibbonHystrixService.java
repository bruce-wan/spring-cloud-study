package com.catalpa.example.service;

import com.catalpa.example.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wanchuan on 2017/9/27.
 */
@Service
public class RibbonHystrixService {
    @Autowired
    private RestTemplate restTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id) {
        return restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }

    public User fallback(Long id) {
        RibbonHystrixService.LOGGER.info("异常发⽣，进⼊fallback⽅法，接收的参数：id = {}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
