package com.demo.springdemo.service;

import com.demo.springdemo.pojo.Order;
import com.demo.springdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: zxb
 * CreateTime: 2026/5/28
 * Project: SpringDemo
 */
@Service
public class UserService {

    @Autowired
    private OrderService orderService;

    public Order getUserOrder(Long userId) {
        return orderService.getOrderByUser(userId);
    }

    public User getUser(Long userId) {
        // 模拟查询后User
        User user = new User();
        user.setId(1L);
        return user;
    }

}
