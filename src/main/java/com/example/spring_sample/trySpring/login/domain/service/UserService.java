package com.example.spring_sample.trySpring.login.domain.service;

import com.example.spring_sample.trySpring.login.domain.model.User;
import com.example.spring_sample.trySpring.login.domain.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao dao;

    public boolean insert(User user) {
        int rowNumber = dao.insertOne(user);

        if (rowNumber > 0) {
            return true;
        }
        return false;
    }

    public int count() {
        return dao.count();
    }

    public List<User> selectMany() {
        return dao.selectMany();
    }

    public User selectOne(String userId) {
        return dao.selectOne(userId);
    }

    public boolean updateOne(User user) {
        int rowNumber = dao.updateOne(user);

        boolean result = false;

        if (rowNumber > 0 ) {
            result = true;
        }

        return result;
    }
}
