package com.example.Bil.Genration.service;


import com.example.Bil.Genration.configuration.AdminConfig;
import com.example.Bil.Genration.configuration.TwilioMailConfig;
import com.example.Bil.Genration.configuration.TwilioWhatshapconfig;
import com.example.Bil.Genration.configuration.Twiliosmsconfig;
import com.example.Bil.Genration.model.Order;
import com.example.Bil.Genration.model.Product;
import com.opencsv.CSVWriter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

@Service
public class AdminMessingService {

    @Autowired
    AdminConfig adminConfig;

    @Autowired
    Twiliosmsconfig twiliosmsconfig;

    @Autowired
    TwilioWhatshapconfig twilioWhatshapconfig;

    @Autowired
    TwilioMailConfig twilioMailConfig;


    @Autowired
    JavaMailSender javaMailSender;

    public void sendwhatsapp(Order order)
    {
        try {
            Message.creator(new PhoneNumber(adminConfig.getWhatsappNumber()),
                    new com.twilio.type.PhoneNumber(twilioWhatshapconfig.getTrialNumber()),
                   "Alert: orders "+order.getId()+"successfully orders.").create();

        }
        catch (Exception e){
            System.out.println("failed Whatsapp msg");
        }

    }


    public void sendSms(Order order) {
        try {
            Message.creator(new PhoneNumber(adminConfig.getPhoneNumber()),
                            new PhoneNumber(twiliosmsconfig.getTrialNumber()),
                            "Alert: orders " + order.getId() + "successfully placed")
                    .create();
        } catch (Exception e) {
            System.out.println("failed sms");
        }
    }

    public void sendemail(String to,String subject,String body){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        javaMailSender.send(message);
    }


    public void sendemailwithAttchment(String to,String subject,String body,String filepath)throws MessagingException {
        MimeMessage message=javaMailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(message,true);

        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(body);

        File file=new File(filepath);
        helper.addAttachment(file.getName(),file);
        javaMailSender.send(message);
    }


    public void genratecsv (List<Product> products) throws Exception {
        String filePath = "product.csv";



        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"Product id", "Product name", "quantity"};
            writer.writeNext(header);


            for (Product product : products) {
                String[] data =
                        {

                                String.valueOf(product.getId()),
                                product.getName(),
                                String.valueOf(product.getQuantity())
                        };
                writer.writeNext(data);
            }
        }
    }

}



