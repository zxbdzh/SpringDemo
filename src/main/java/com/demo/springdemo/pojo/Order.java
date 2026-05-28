package com.demo.springdemo.pojo;

/**
 * Author: zxb
 * CreateTime: 2026/5/28
 * Project: SpringDemo
 */
public class Order {

    private String orderId;
    private Long userId;
    // 订单金额
    private Long amount;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
