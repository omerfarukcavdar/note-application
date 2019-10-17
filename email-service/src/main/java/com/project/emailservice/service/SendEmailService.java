package com.project.emailservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("o.f.cavdar10@gmail.com", "mihrinurgrn@gmail.com");

        msg.setSubject("Note");
        msg.setText("Your note has been changed");

        javaMailSender.send(msg);

    }
}
