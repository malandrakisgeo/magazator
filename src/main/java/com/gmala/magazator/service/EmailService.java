package com.gmala.magazator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendActivationEmail(String email, String verificationNumber){
        String content = "Click here: "+ "/verify/" + verificationNumber;

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@magazator.se");
        message.setTo(email);
        message.setText(content);

        javaMailSender.send(message);
    }
}
