package com.example.demo.security.model;

import javax.persistence.*;

@Entity
@Table(name = "account_user")
public class AccountUser {

    @Id
    @SequenceGenerator(name = "user_generator", sequenceName = "account_user_sequence", allocationSize = 1)
    @GeneratedValue(generator = "user_generator")
    private int id;

    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
