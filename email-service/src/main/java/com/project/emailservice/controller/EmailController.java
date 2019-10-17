package com.project.emailservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @PostMapping("/email")
    public Boolean sendEmail(){

    }
}
