package com.yann.springbootmybatis.service.impl;

//import com.yann.springbootrestful.dao.CityDao;
//import com.yann.springbootrestful.domain.City;
//import com.yann.springbootrestful.service.CityService;
import com.yann.springbootmybatis.dao.CityDao;
import com.yann.springbootmybatis.domain.City;
import com.yann.springbootmybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<City> findAllCity(){
        return cityDao.findAllCity();
    }

    public  City findCityById(Long id){
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city){
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city){
        return cityDao.updateCity(city);
    }

    @Override
    public  Long deleteCity(Long id){
        return cityDao.deleteCity(id);
    }

}
