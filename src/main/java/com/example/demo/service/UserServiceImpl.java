package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void deleteUserById(Integer userid) {
        Map<String, Object> params=new HashMap<>();
        params.put("id",userid);
        this.userDao.delete(params);
    }

    @Override
    public void deleteUserByName(String username) {
        Map<String, Object> params=new HashMap<>();
        params.put("name",username);
        this.userDao.delete(params);
    }

    @Override
    public List<User> getUsers() {
        return userDao.selectAll();
    }

    @Override
    public User getUserById(Integer userid) {
        Map<String, Object> params=new HashMap<>();
        params.put("id",userid);
        return userDao.selectOne(params);
    }

    @Override
    public User getUserByName(String username) {
        return null;
    }
}
