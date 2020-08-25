package com.example.spring_sample.trySpring.login.domain.service;

import com.example.spring_sample.trySpring.login.domain.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao dao;
}
