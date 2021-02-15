package com.example.spring_sample.trySpring.login.domain.repository.jdbc;

import com.example.spring_sample.trySpring.login.domain.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

        User user = new User();
        user.setUserId(rs.getString("user_id"));
        user.setPassword(rs.getString("password"));
        user.setUserName(rs.getString("user_name"));
        user.setBirthday(rs.getDate("birthday"));
        user.setAdmin(rs.getBoolean("admin"));
        user.setRole(rs.getString("role"));
        return user;
    }
}
