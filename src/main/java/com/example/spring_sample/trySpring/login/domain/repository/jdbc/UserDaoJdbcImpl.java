package com.example.spring_sample.trySpring.login.domain.repository.jdbc;

import com.example.spring_sample.trySpring.login.domain.model.User;
import com.example.spring_sample.trySpring.login.domain.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoJdbcImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public int count() throws DataAccessException {
        return jdbc.queryForObject("SELECT COUNT(*) FROM m_user", Integer.class);
    }

    @Override
    public int insertOne(User user) throws DataAccessException {
        int rowNumber = jdbc.update("INSERT INTO m_user(user_id,"
                        + "password,"
                        + "user_name,"
                        + "birthday,"
                        + "admin,"
                        + "role)"
                        + " VALUES(?,?,?,?,?,?)"
                , user.getUserId()
                , user.getPassword()
                , user.getUserName()
                , user.getBirthday()
                , user.isAdmin()
                , user.getRole());
        return rowNumber;
    }

    @Override
    public User selectOne(String userId) throws DataAccessException {
        Map<String, Object> map = jdbc.queryForMap("SELECT * FROM m_user WHERE user_id = ?", userId);

        User user = new User();
        convertToUser(map, user);
        return user;
    }

    @Override
    public int updateOne(User user) throws DataAccessException {
        int rowNumber = jdbc.update("UPDATE m_user"
                        + " SET"
                        + " password =?,"
                        + " user_name =?,"
                        + " birthday =?,"
                        + " admin =?"
                        + " WHERE user_id = ?"
                , user.getPassword()
                , user.getUserName()
                , user.getBirthday()
                , user.isAdmin()
                , user.getUserId());
        return rowNumber;
    }

    @Override
    public int deleteOne(String userId) throws DataAccessException {
        int rowNumber = jdbc.update("DELETE FROM m_user WHERE user_id = ?", userId);
        return rowNumber;
    }

    @Override
    public void userCsvOut() throws DataAccessException {
        String sql = "SELECT * FROM m_user";

        UserRowCallbackHandler handler = new UserRowCallbackHandler();
        jdbc.query(sql, handler);

    }

    @Override
    public List<User> selectMany() throws DataAccessException {

        List<Map<String, Object>> getList = jdbc.queryForList("SELECT * FROM m_user");

        List<User> userList = new ArrayList<>();

        for (Map<String, Object> map : getList) {
            User user = new User();
            convertToUser(map, user);
            userList.add(user);
        }
        return userList;
    }

    private void convertToUser(Map<String, Object> map, User user) {
        user.setUserId((String) map.get("user_id"));
        user.setPassword((String) map.get("password"));
        user.setUserName((String) map.get("user_name"));
        user.setBirthday((Date) map.get("birthday"));
        user.setAdmin((Boolean) map.get("admin"));
        user.setRole((String) map.get("role"));
    }
}
