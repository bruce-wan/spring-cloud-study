package com.catalpa.example.service;

import com.catalpa.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wanchuan on 2017/9/27.
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }
}
