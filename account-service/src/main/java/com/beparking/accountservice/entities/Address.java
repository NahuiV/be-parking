package com.beparking.accountservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address extends BaseEntity{
    @Id
    private Long id;
    private String fullAddress;
    private String postalCode;
    private String city;
}
