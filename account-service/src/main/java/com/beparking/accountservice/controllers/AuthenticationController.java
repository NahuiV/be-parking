package com.beparking.accountservice.controllers;

import com.beparking.accountservice.services.AuthenticationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController (AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public void register(){

    }

    public void login () {

    }

    public void logout(){

    }

    public Boolean validateToken(){return true;}
}
