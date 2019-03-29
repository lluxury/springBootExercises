package com.yann.springbootmybatisredis.dao;

import com.yann.springbootmybatisredis.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市 DAO 接口类
 * @author: Yann
 * @create: 2019-03-29 15:13
 **/
public interface CityDao {
    List<City> findAllCity();

    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
