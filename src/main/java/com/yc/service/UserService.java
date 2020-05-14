package com.yc.service;


import com.yc.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll() throws Exception;

    boolean isUsernameExist(String username) throws Exception;

    List<User> getUserByName(String username) throws Exception;

    void insertUser(User user) throws Exception;

    User getUserById(Integer id) throws Exception;

    void updateUser(User user) throws Exception;

    void deleteUser(Integer id) throws Exception;

}
