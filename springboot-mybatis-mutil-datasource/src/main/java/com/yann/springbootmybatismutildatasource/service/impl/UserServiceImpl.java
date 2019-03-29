package com.yann.springbootmybatismutildatasource.service.impl;

import com.yann.springbootmybatismutildatasource.dao.cluster.CityDao;
import com.yann.springbootmybatismutildatasource.dao.master.UserDao;
import com.yann.springbootmybatismutildatasource.domain.City;
import com.yann.springbootmybatismutildatasource.domain.User;
import com.yann.springbootmybatismutildatasource.service.UserService;
import org.apache.tomcat.util.buf.UDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: demo3
 * @description: 用户业务实现层
 * @author: Yann
 * @create: 2019-03-28 16:58
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Autowired
    private CityDao cityDao; // 从数据源

    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("Jn市");
        user.setCity(city);
        return user;
//        从库查出abc后，主库用set方法设置，返回user类型
    }
}
