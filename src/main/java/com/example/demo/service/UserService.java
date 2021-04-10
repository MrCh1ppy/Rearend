package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUserById(Integer userid);
    void deleteUserByName(String username);
    List<User> getUsers();
    User getUserById(Integer userid);
    User getUserByName(String username);
}
