package com.example.Bil.Genration.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio.whatsapp")
public class TwilioWhatshapconfig
{
    private  String trialNumber;
    public TwilioWhatshapconfig()
    {

    }

    public TwilioWhatshapconfig(String trialNumber)
    {
        this.trialNumber=trialNumber;
    }

    public String getTrialNumber()
    {
        return trialNumber;

    }

    public void setTrialNumber(String trialNumber)
    {
        this.trialNumber=trialNumber;
    }


}
