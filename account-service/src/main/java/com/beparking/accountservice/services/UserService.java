package com.beparking.accountservice.services;

import com.beparking.accountservice.dtos.RegisterDTO;
import com.beparking.accountservice.entities.User;
import com.beparking.accountservice.mappers.UserMapper;
import com.beparking.accountservice.repositories.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserMapper userMapper;
    private static final Logger LOGGER = LogManager.getLogger(UserService.class);

    public UserService (UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder, UserMapper userMapper){
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public void createUser(RegisterDTO request){
        LOGGER.info(()->"Create user init");

        User user = userMapper.convertToEntity(request);

        String encodedPassword = bCryptPasswordEncoder.encode();
        user.setPassword(encodedPassword);

        try{
            userRepository.save(user);
        }catch (Exception e){
            LOGGER.error(()->"Failed to save new user. Cause by " + e.getMessage());
        }
    }

    public Boolean existByEmail(String email){
        return userRepository.existByEmail(email);
    }
}
