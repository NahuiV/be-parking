package com.beparking.accountservice.services;

import com.beparking.accountservice.dtos.RegisterDTO;
import com.beparking.accountservice.dtos.UserDTO;
import com.beparking.accountservice.entities.User;
import com.beparking.accountservice.mappers.UserMapper;
import com.beparking.accountservice.repositories.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService (UserRepository userRepository,UserMapper userMapper){
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public void createUser(RegisterDTO request){
        User user = userMapper.convertToEntity(request);
        try{
            userRepository.save(user);
        }catch (Exception e){

        }
    }
    public Boolean existByEmail(String email){
        return userRepository.existByEmail(email);
    }
}
