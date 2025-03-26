package com.example.Bil.Genration.controller;


import com.example.Bil.Genration.model.Order;
import com.example.Bil.Genration.model.Product;
import com.example.Bil.Genration.service.AdminMessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    AdminMessingService adminMessingService;


    @PostMapping("whatsapp")
    public String sendWhatsapp(@RequestBody Order order) {
        adminMessingService.sendwhatsapp(order);
        return "WhatsApp message sent successfully!";
    }

    @PostMapping("sms")
    public String sendsms(@RequestBody Order order)
    {
        adminMessingService.sendSms(order);
        return "SMS sent successfully";
    }

    @GetMapping("email")
    public String sendEmailWithAttachment(@RequestParam String to,@RequestParam String subject,@RequestParam String body){
       adminMessingService.sendemail(to, subject, body);
        return "email sent successfully!";
    }


    @PostMapping("csv")
    public  String generateAndsendCSV(@RequestParam List<Product> products, @RequestParam String toemail) throws Exception {
        adminMessingService.genratecsv(products);
        adminMessingService.sendemailwithAttchment(toemail,"product Details","Attached is your order details.","product.csv");
        return "CSV generated and email sent successfully.";
    }
}
