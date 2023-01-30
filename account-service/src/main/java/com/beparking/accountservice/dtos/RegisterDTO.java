package com.beparking.accountservice.dtos;

public record RegisterDTO(
        String email,
        String password,
        String firstName,
        String lastName
) {
}
