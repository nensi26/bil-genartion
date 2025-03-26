//package com.example.Bil.Genration.controller;
//
//import com.example.Bil.Genration.model.Product;
//import com.example.Bil.Genration.service.CSVService;
////import com.example.Bil.Genration.service.EmailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api")
//public class EmailController {
//
////    @Autowired
////    private EmailService emailService;
//
//    @Autowired
//    CSVService csvService;
//
//    @GetMapping("email")
//    public String sendemailwithbody(@RequestParam String to,@RequestParam String subject,@RequestParam String body){
//        emailService.sendemail(to, subject, body);
//        return "email sent successfully!";
//    }
//
//    @PostMapping("csv")
//    public  String generateAndsendCSV(@RequestParam List<Product>products,@RequestParam String toemail) throws Exception {
//        csvService.genratecsv(products);
//        emailService.sendemailwithAttchment(toemail,"product Details","Attached is your order details.","product.csv");
//        return "CSV generated and email sent successfully.";
//    }
//}
