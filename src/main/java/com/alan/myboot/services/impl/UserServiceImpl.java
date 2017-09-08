package com.alan.myboot.services.impl;

import com.alan.myboot.dao.UserDao;
import com.alan.myboot.entity.User;
import com.alan.myboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : hechucai
 * @Description :
 * @Date : Created in ${time} ${date}
 * @Modified By :
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
