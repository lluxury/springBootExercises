package com.yann.springbootmybatisannotation.service;

import com.yann.springbootmybatisannotation.domain.City;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市业务逻辑接口类
 * @author: Yann
 * @create: 2019-03-25 14:19
 **/
public interface CityService {

//    City findCityByName(String cityName);
//    Long saveCity(City city);
//    Long updateCity(City city);
//    Long deleteCity(Long id);
    
    /** 
    * @Description:  根据城市名称，查询城市信息
    * @Param: [cityName] 
    * @return: com.yann.springbootmybatisannotation.domain.City 
    * @Author: Yann 
    * @date 2019/3/28 11:38
    */ 
    City findCityByName(String cityName);
}
