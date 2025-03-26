package com.example.Bil.Genration.service;


import com.example.Bil.Genration.Repository.CustomerRepository;
import com.example.Bil.Genration.Repository.OrderRepository;
import com.example.Bil.Genration.model.Customer;
import com.example.Bil.Genration.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{

    @Autowired
    CustomerRepository customerRepository;



    public Customer save(Customer customer)
    {
        return customerRepository.save(customer);
    }




}
