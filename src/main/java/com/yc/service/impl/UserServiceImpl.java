package com.yc.service.impl;

import com.yc.dao.UserDao;
import com.yc.model.User;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() throws Exception {
        return userDao.findAll();
    }

    @Override
    public boolean isUsernameExist(String username) throws Exception {
        List<User> users = getUserByName(username);
        return users != null && users.size() > 0;
    }

    public List<User> getUserByName(String username) throws Exception{
        return userDao.getUserByName(username);
    }

    @Override
    public void insertUser(User user) throws Exception {
        userDao.insert(user);
    }

    @Override
    public User getUserById(Integer id) throws Exception {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) throws Exception {
        userDao.deleteUser(id);
    }
}
