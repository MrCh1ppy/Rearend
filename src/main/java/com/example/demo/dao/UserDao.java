package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

/**
 *  这是一个实现用户增删改查的类
 */
@SpringBootApplication
public interface UserDao {

    //添加方法
    public void insert(User user);

    //删除方法
    //根据用户或id删除
    public void delete(Map<String,Object> params);

    //修改方法
    //修改用户全部信息
    int update(User user);
    /*修改密码*/
    void updatePassword(String password);
    /*修改权限*/
    void updateIdentity(String identity);
    //查询方法
    List<User> selectAll();
    //单条查询方法
    //根据用户名或id查询
    User selectOne(Map<String,Object> params);
    //多条查询
    List<User> select(String identity);
}