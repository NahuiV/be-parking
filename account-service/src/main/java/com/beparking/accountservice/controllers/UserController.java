package com.beparking.accountservice.controllers;

import com.beparking.accountservice.services.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

}