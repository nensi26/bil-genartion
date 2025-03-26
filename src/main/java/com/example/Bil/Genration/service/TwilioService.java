//package com.example.Bil.Genration.service;
//
//
//import com.example.Bil.Genration.model.Order;
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TwilioService {
//
//
//  public static final String ACCOUNT_SID ="AC9dc3e3877ff226c4da59b9596516dade";
 //  public static final String AUTH_TOKEN = "a9a972cf68b62347d97632e3a3881c3c";
//
//
//
//static {
//    Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
//}
//
//
//        public void sendwhatshap(Order order){
//        String messagecontain=String.format("sucessfull");
//
//        Message.creator( new PhoneNumber("+919316927878"),
//                new PhoneNumber("+14155238886"),messagecontain
//       ).create();
//
//
//            System.out.println("send message");
//
//    }
//
//    public void sendsms(Order order){
//        String messagecontain=String.format("order sucessfull placed");
//
//        Message.creator( new PhoneNumber("+919316927878"),
//                        new PhoneNumber("+15074076150"),messagecontain
//        ).create();
//
//
//        System.out.println("send message");
//
//    }
//
//    }
//
//
//
