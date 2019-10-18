package com.project.emailservice.controller;

import com.project.emailservice.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("/email/{email}")
    public Boolean sendEmail(@PathVariable String email){
        sendEmailService.sendEmail(email);
        return true;
    }
}
