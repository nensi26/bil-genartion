package com.example.Bil.Genration.controller;

import com.example.Bil.Genration.model.Customer;
import com.example.Bil.Genration.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping("save")
    public Customer save(@RequestBody Customer customer)
    {
        return customerService.save(customer);
    }
}
