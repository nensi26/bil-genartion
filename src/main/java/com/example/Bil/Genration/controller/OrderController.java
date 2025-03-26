package com.example.Bil.Genration.controller;


import com.example.Bil.Genration.model.Order;
//import com.example.Bil.Genration.service.EmailService;
import com.example.Bil.Genration.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

//    @Autowired
//    EmailService emailService;


    @PostMapping("place")
    public Order placOrder(@RequestBody Order order) {
        return orderService.placeorder(order);  // Return the order after creation
    }


}