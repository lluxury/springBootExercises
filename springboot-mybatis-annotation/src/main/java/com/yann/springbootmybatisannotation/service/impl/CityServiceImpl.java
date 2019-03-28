package com.yann.springbootmybatisannotation.service.impl;

import com.yann.springbootmybatisannotation.dao.CityDao;
import com.yann.springbootmybatisannotation.domain.City;
import com.yann.springbootmybatisannotation.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: demo3
 * @description: 城市业务逻辑实现类
 * @author: Yann
 * @create: 2019-03-25 14:23
 **/
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

//    public City findCityByName(String cityName){
//        return cityDao.findByName(cityName);
//    }

    public City findCityByName(String cityName){
        return cityDao.findByName(cityName);
    }


}
