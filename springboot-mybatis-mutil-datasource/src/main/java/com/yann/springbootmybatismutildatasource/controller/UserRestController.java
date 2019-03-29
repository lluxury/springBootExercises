package com.yann.springbootmybatismutildatasource.controller;

import com.yann.springbootmybatismutildatasource.domain.User;
import com.yann.springbootmybatismutildatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo3
 * @description: 用户控制层
 * @author: Yann
 * @create: 2019-03-28 17:18
 **/
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public User findByName(@RequestParam(value = "userName", required = true) String userName){
        return userService.findByName(userName);
    }
}
