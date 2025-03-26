package com.example.Bil.Genration.configuration;


import com.twilio.Twilio;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio")
public class Twiliosmsconfig {



    private String trialNumber;
    public static final String ACCOUNT_SID ="AC9dc3e3877ff226c4da59b9596516dade";
    public static final String AUTH_TOKEN = "a9a972cf68b62347d97632e3a3881c3c";



    static {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }


    public String getTrialNumber() {
        return trialNumber;
    }

    public void setTrialNumber(String trialNumber) {
        this.trialNumber = trialNumber;
    }

    public Twiliosmsconfig(){



    }





}

