package com.alan.myboot.controller;

import com.alan.myboot.entity.User;
import com.alan.myboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author : hechucai
 * @Description :
 * @Date : Created in ${time} ${date}
 * @Modified By :
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User findUserByame(@RequestParam(value = "name") String name) {
        return userService.findUserByName(name);
    }

    @RequestMapping(value = "user/all",method = RequestMethod.GET)
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}
