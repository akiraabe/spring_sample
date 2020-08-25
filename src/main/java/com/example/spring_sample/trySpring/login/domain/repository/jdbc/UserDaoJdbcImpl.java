package com.example.spring_sample.trySpring.login.domain.repository.jdbc;

import com.example.spring_sample.trySpring.login.domain.model.User;
import com.example.spring_sample.trySpring.login.domain.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoJdbcImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public int count() throws DataAccessException {
        return 0;
    }

    @Override
    public User selectOne(String userId) throws DataAccessException {
        return null;
    }

    @Override
    public int updateOne(User user) throws DataAccessException {
        return 0;
    }

    @Override
    public int deleteOne(String userId) throws DataAccessException {
        return 0;
    }

    @Override
    public void userCsvOut() throws DataAccessException {

    }
}