package com.example.demo.config;

import com.example.demo.repository.UserCrudRepository;
import com.example.demo.security.model.AccountUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataSeedRunner implements CommandLineRunner {

    @Autowired
    private UserCrudRepository userCrudRepository;


    @Override
    public void run(String... args) throws Exception {
        Optional<AccountUser> existingUser = userCrudRepository.findById(100);
        if(!existingUser.isPresent()){
            AccountUser user = new AccountUser();
            user.setPassword("qwer");
            user.setUsername("test");
            userCrudRepository.save(user);
        }
    }
}
