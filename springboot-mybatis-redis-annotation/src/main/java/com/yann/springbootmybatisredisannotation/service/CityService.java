package com.yann.springbootmybatisredisannotation.service;

//import com.yann.springbootmybatisredis.domain.City;

import com.yann.springbootmybatisredisannotation.domain.City;

/**
 * @program: demo3
 * @description: 城市业务逻辑接口类
 * @author: Yann
 * @create: 2019-03-29 15:44
 **/
public interface CityService {

    City getCityByName(String cityName);

    /**
    * @Description: 新增城市信息
    * @Param: [city]
    * @return: void
    * @Author: Yann
    * @date 2019/3/29 18:33
    */
    void saveCity(City city);

    void updateCityDescription(String cityName, String description);
}
