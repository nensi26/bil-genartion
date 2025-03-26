package com.example.Bil.Genration.controller;


import com.example.Bil.Genration.model.Product;
import com.example.Bil.Genration.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("save")
    public void save(@RequestBody Product product) {
        productService.Save(product);
    }


    @PutMapping("updateStock")
    public Product updateStockAndCheckTreshHold(@RequestParam long id, @RequestParam int quantity, @RequestParam int newStock) {
      return productService.updateStockAndCheckTreshHold(id, quantity, newStock);

   }

}
