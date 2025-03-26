package com.example.Bil.Genration.service;


import com.example.Bil.Genration.Repository.OrderRepository;
import com.example.Bil.Genration.Repository.ProductRepository;
import com.example.Bil.Genration.model.Order;
import com.example.Bil.Genration.model.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;



@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;







    public Order placeorder(Order order) {

        Product product = productRepository.findById(order.getProduct().getId()).orElseThrow(() -> new RuntimeException("product not found"));
        //  orer ma apeli mahiti no use kari ne data lavse nai male to runtimeerror product not found

        if (product.getQuantity() < order.getQuantity())  // order karyo e matra ochi hase to insufficient stock no msg avse
        {
            throw new RuntimeException("Insufficient stock");
        }

        // gst calculation

        double gst = product.getPrice() * 0.12;
        double totalprice = (product.getPrice() + gst) * order.getQuantity();    // order ma set karse
        order.setTotalprice(totalprice);


        product.setQuantity(product.getQuantity() - order.getQuantity());
        productRepository.save(product);


        // payent details

        order.setPaymentAmount(totalprice);
        order.setPaymentStatus("paid");
        order.setPaymentdate(LocalDate.now());


        // save order
        return orderRepository.save(order);

    }


}