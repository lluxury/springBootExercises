package com.yann.springbootfreemarker.service.impl;

import com.yann.springbootfreemarker.dao.CityDao;
import com.yann.springbootfreemarker.domain.City;
import com.yann.springbootfreemarker.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市业务逻辑实现类
 * @author: Yann
 * @create: 2019-03-26 10:57
 **/
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city){
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id){
        return cityDao.deleteCity(id);
    }
}
