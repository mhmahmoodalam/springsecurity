package com.example.demo.repository;

import com.example.demo.security.model.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AccountUser, Integer> {
    Optional<AccountUser> findUserByUsername(String username);
}
