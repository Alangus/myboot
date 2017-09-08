package com.alan.myboot.services;

import com.alan.myboot.entity.User;

import java.util.List;

/**
 * @Author : hechucai
 * @Description :
 * @Date : Created in ${time} ${date}
 * @Modified By :
 */

public interface UserService {

    User findUserByame(String name);

    List<User> findAllUser();
}
