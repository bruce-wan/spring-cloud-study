package com.catalpa.example.controller;

import com.catalpa.example.entity.User;
import com.catalpa.example.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanchuan on 2017/9/27.
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonService.findById(id);
    }
}
