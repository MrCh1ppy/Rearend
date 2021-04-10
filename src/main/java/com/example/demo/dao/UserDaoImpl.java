package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void insert(User user) {

    }

    @Override
    public void delete(Map<String, Object> params) {

    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public void updatePassword(String password) {

    }

    @Override
    public void updateIdentity(String identity) {

    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public User selectOne(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<User> select(String identity) {
        return null;
    }
}
