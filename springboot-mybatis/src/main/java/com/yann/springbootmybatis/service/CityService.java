package com.yann.springbootmybatis.service;

//import com.yann.springbootrestful.domain.City;

import com.yann.springbootmybatis.domain.City;

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
    
    /** 
    * @Description 根据城市名称，查询城市信息
    * @Param: [cityName] 
    * @return: com.yann.springbootmybatis.domain.City 
    * @Author: Yann 
    * @date 2019/3/27 14:12
    */ 
//    City findCityByName(String dityname);
    City findCityByName(String cityName);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
