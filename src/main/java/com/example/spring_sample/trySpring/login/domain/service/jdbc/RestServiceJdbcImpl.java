package com.example.spring_sample.trySpring.login.domain.service.jdbc;

import com.example.spring_sample.trySpring.login.domain.model.User;
import com.example.spring_sample.trySpring.login.domain.repository.UserDao;
import com.example.spring_sample.trySpring.login.domain.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RestServiceJdbcImpl implements RestService {

    @Autowired
    //@Qualifier("UserDaoJdbcImpl")
    UserDao dao;

    @Override
    public boolean insert(User user) {
        return false;
    }

    @Override
    public User selectOne(String userId) {
        return dao.selectOne(userId);
    }

    @Override
    public List<User> selectMany() {
        return dao.selectMany();
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(String userId) {
        return false;
    }
}
