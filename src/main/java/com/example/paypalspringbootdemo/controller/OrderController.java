package com.example.paypalspringbootdemo.controller;

import com.example.paypalspringbootdemo.dto.OrderDto;
import com.example.paypalspringbootdemo.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: hsl
 * @Date: Created in 20:07 2022/5/27
 * @Desprition:Welcome 控制类
 */
@RestController
@RequestMapping(path = "/v1/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "创建订单")
    @RequestMapping(value = "/createOrder")
    public OrderDto createOrder() {
        return orderService.createOrder();
    }

    @ApiOperation(value = "查询订单详情")
    @RequestMapping(value = "/ordersGet")
    public OrderDto ordersGet(@RequestParam String orderId) {
        return orderService.ordersGet(orderId);

    }
}