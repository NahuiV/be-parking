package com.beparking.accountservice.controllers;

import com.beparking.accountservice.dtos.RegisterDTO;
import com.beparking.accountservice.services.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/authentication/")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController (AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody RegisterDTO request){
        authenticationService.register(request);
    }


    public void login () {

    }

    public void logout(){

    }

    public Boolean validateToken(){return true;}
}
