package com.beparking.accountservice.mappers;

import com.beparking.accountservice.enums.Role;
import com.beparking.accountservice.dtos.RegisterDTO;
import com.beparking.accountservice.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User convertToEntity(RegisterDTO register){
        User user = new User();
        user.setEmail(register.email());
        user.setFirstName(register.firstName());
        user.setLastName(register.lastName());
        user.setRole(Role.EMPLEADO);
        return user;
    }
}
