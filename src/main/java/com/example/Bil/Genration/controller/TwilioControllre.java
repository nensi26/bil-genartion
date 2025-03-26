//package com.example.Bil.Genration.controller;
//
//import com.example.Bil.Genration.model.Order;
//import com.example.Bil.Genration.service.TwilioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("twilio")
//public class TwilioControllre {
//
//    @Autowired
//    TwilioService twilioService;
//
//    @PostMapping("whatsapp")
//    public String sendSms(@RequestBody Order order) {
//        twilioService.sendwhatshap(order);
//        return "sucessfull";
//    }
//
//    @PostMapping("sms")
//    public String sendsms(@RequestBody Order order) {
//        twilioService.sendsms(order);
//        return "order sucessfully";
//    }
//}
