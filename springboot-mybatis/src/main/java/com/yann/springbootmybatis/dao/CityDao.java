package com.yann.springbootmybatis.dao;

//import com.yann.springbootrestful.domain.City;
import com.yann.springbootmybatis.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市 DAO 接口类
 * @author: Yann
 * @create: 2019-03-25 14:09
 **/
public interface CityDao {

    List<City> findAllCity();

    City findById(@Param("id") Long id);
//    City findByName(@Param ("city_name") String city_name);
    City findByName(@Param("cityName") String cityName);    // 使用属性名和数据库字段无关了
    Long saveCity(City city);
    Long updateCity(City city);
    Long deleteCity(Long id);
}
