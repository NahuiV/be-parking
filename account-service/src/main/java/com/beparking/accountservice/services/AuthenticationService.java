package com.beparking.accountservice.services;

import com.beparking.accountservice.dtos.RegisterDTO;
import com.beparking.accountservice.dtos.UserDTO;
import com.beparking.accountservice.entities.User;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserService userService;

    public AuthenticationService(UserService userService){
        this.userService = userService;
    }

    public void register(RegisterDTO request) throws Exception {
        Boolean check = userService.existByEmail(request.email());

        if (check) {
            throw new Exception("User with email already exists");
        }
    }


}
