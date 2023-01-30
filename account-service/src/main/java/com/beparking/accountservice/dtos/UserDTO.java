package com.beparking.accountservice.dtos;

import com.beparking.accountservice.enums.Role;

public record UserDTO(
        String firstName,
        String lastName,
        String address,
        Role role,
        String email
) {
}
