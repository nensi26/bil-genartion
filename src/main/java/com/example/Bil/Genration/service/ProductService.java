package com.example.Bil.Genration.service;

import com.example.Bil.Genration.Repository.ProductRepository;
import com.example.Bil.Genration.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public void Save(Product product) {
        productRepository.save(product);

    }


    public Product updateStockAndCheckTreshHold(long id, int quantity, int newstock) {
        int treshhold = 10;
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not available"));


        if (product.getQuantity() < quantity) {
            throw new RuntimeException("not stock");
        }


        product.setQuantity(product.getQuantity() - quantity);
        productRepository.save(product);

        if (product.getQuantity() < treshhold) {
            product.setQuantity(product.getQuantity() + newstock);

            product.setNewstock(50);
            productRepository.save(product);
            System.out.println("new stock add");
        } else {
            System.out.println("stock update sucessfully");
        }
        return product;
    }
}
