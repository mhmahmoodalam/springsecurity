package com.example.demo.config;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.JdbcUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    /**
     * Simple configuration example
     *
    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
        UserDetails user = User.builder().username("test")
                .password("test")
                .authorities("read")
                .build();
        userDetailsService.createUser(user);
        return userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    */

     @Bean
     public PasswordEncoder passwordEncoder(){
     return NoOpPasswordEncoder.getInstance();
     }
}
