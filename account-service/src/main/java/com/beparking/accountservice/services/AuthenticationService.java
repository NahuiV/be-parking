package com.beparking.accountservice.services;

import com.beparking.accountservice.dtos.LoginDTO;
import com.beparking.accountservice.dtos.RegisterDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class AuthenticationService {

    private static final Logger LOGGER = LogManager.getLogger(AuthenticationService.class);

    private final UserService userService;

    public AuthenticationService(UserService userService){
        this.userService = userService;
    }

    public void register (RegisterDTO request) {

        if(validateEmail(request.email())){
            throw new RuntimeException("email wrong");
        }

        if (!userService.existByEmail(request.email())){
            throw new RuntimeException("User with email {} already exists");
        };

        userService.createUser(request);
    }

    public void login (LoginDTO request) {
        if(validateEmail(request.email())){
            LOGGER.error(()->"This email is no valid");
            throw new RuntimeException();
        }
        boolean check = userService.existByEmail(request.email());

    }

    public void logout (){
    }

    private boolean validateEmail(String email){
        String pattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return !Pattern.compile(pattern).matcher(email).matches();
    }

    public boolean validateToken(){
        return true;
    }
}
