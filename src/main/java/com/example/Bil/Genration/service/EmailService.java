//package com.example.Bil.Genration.service;
//
//
//import jakarta.mail.MessagingException;
//import jakarta.mail.internet.MimeMessage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//
//@Service
//public class EmailService {
//
//    @Autowired
//    JavaMailSender mailSender;
//
//
//    public void sendemailwithAttchment(String to,String subject,String body,String filepath)throws MessagingException {
//        MimeMessage message=mailSender.createMimeMessage();
//        MimeMessageHelper helper=new MimeMessageHelper(message,true);
//
//        helper.setTo(to);
//        helper.setSubject(subject);
//        helper.setText(body);
//
//        File file=new File(filepath);
//        helper.addAttachment(file.getName(),file);
//        mailSender.send(message);
//    }
//
//
//
//    public void sendemail(String to,String subject,String body){
//        SimpleMailMessage message=new SimpleMailMessage();
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(body);
//        mailSender.send(message);
//    }
//}
