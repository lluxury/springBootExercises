package com.yann.springbootmybatisredisannotation.service.impl;


import com.yann.springbootmybatisredisannotation.domain.City;
import com.yann.springbootmybatisredisannotation.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//import org.springframework.beans.factory.annotation.Value;

/**
 * @program: demo3
 * @description: 城市业务逻辑实现类
 * @author: Yann
 * @create: 2019-03-29 15:49
 **/
@Service
public class CityServiceImpl implements CityService {

    // 模拟数据库存储
    private Map<String, City> cityMap = new HashMap<String, City>();

    public void saveCity(City city){
        // 模拟数据库插入操作
        cityMap.put(city.getCityName(),city);
    }

    @Cacheable(value = "baseCityInfo")
    public City getCityByName(String cityName){
        // 模拟数据库查询并返回
        return cityMap.get(cityName);
    }

    @CachePut(value = "baseCityInfo")
    public void updateCityDescription(String cityName, String description){
        City city = cityMap.get(cityName);
        city.setDescription(description);
        // 模拟更新数据库
        cityMap.put(cityName,city);
    }
}