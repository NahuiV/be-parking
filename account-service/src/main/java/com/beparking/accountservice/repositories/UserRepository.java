package com.beparking.accountservice.repositories;

import com.beparking.accountservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(name = "",nativeQuery = true)
    Boolean existByEmail(String email);
}
