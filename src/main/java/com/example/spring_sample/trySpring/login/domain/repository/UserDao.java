package com.example.spring_sample.trySpring.login.domain.repository;

import com.example.spring_sample.trySpring.login.domain.model.User;
import org.springframework.dao.DataAccessException;

public interface UserDao {

    public int count() throws DataAccessException;

    public User selectOne(String userId) throws DataAccessException;

    public int updateOne(User user) throws DataAccessException;

    public int deleteOne(String userId) throws DataAccessException;

    public void userCsvOut() throws DataAccessException;

}
