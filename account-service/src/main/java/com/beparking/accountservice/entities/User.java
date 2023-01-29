package com.beparking.accountservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user_account",uniqueConstraints = {
        @UniqueConstraint(name = "user_email_unique",columnNames = "email")
})
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname",nullable = false,length = 100)
    private String firstName;

    @Column(name = "lastname",nullable = false)
    private String lastName;
}
