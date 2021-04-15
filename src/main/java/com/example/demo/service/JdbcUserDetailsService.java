package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import com.example.demo.security.model.SecurityUser;
import com.example.demo.security.model.AccountUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class JdbcUserDetailsService  implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public JdbcUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AccountUser> user = userRepository.findUserByUsername(username);
        if(user.isPresent()){
            return new SecurityUser(user.get());
        }else {
            throw new UsernameNotFoundException("Username :"+username +" Not found");
        }
    }
}
