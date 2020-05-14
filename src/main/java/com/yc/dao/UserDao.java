package com.yc.dao;

import com.yc.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll() throws Exception;

    List<User> getUserByName(String username) throws Exception;

    void insert(User user) throws Exception;

    User getUserById(Integer id) throws Exception;

    void updateUser(User user) throws Exception;

    void deleteUser(Integer id) throws Exception;
}
