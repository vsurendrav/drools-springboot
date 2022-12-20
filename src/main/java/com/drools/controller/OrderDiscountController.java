package com.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drools.model.OrderDiscount;
import com.drools.model.OrderRequest;
import com.drools.service.OrderDiscountService;

@RestController
@RequestMapping("/api/order")
public class OrderDiscountController {
 
    @Autowired
    private OrderDiscountService orderDiscountService;
 
    @PostMapping("/get-discount")
    public OrderDiscount getDiscount(@RequestBody OrderRequest orderRequest) {
        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
        return discount;
    }
}
