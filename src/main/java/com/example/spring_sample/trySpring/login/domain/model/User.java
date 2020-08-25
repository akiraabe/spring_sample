package com.example.spring_sample.trySpring.login.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private String userId;
    private String password;
    private Date birthday;
    private boolean admin;
    private String role;
}
