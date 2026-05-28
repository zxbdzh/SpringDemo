package com.demo.springdemo.service;

import com.demo.springdemo.pojo.Order;
import com.demo.springdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Author: zxb
 * CreateTime: 2026/5/28
 * Project: SpringDemo
 */
@Service
public class OrderService {

    @Lazy
    @Autowired
    private UserService userService;

    public Order getOrderByUser(Long userId) {
        User user = userService.getUser(userId);
        Order order = new Order();
        order.setOrderId("xxx");
        order.setAmount(100L);
        order.setUserId(user.getId());
        return order;
    }

}
