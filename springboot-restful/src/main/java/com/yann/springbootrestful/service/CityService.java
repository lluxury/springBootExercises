package com.yann.springbootrestful.service;

import com.yann.springbootrestful.domain.City;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市业务逻辑接口类
 * @author: Yann
 * @create: 2019-03-25 14:19
 **/
public interface CityService {

    List<City> findAllCity();

    City findCityById(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
