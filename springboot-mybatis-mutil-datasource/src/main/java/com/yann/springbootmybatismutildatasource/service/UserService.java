package com.yann.springbootmybatismutildatasource.service;

import com.yann.springbootmybatismutildatasource.domain.User;

/**
 * @program: demo3
 * @description: 用户业务接口层
 * @author: Yann
 * @create: 2019-03-28 16:56
 **/
public interface UserService {

    User findByName(String userName);
}
