package com.yann.springbootmybatisannotation.dao;

import com.yann.springbootmybatisannotation.domain.City;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市 DAO 接口类
 * @author: Yann
 * @create: 2019-03-25 14:09
 **/
@Mapper // 标志为 Mybatis 的 Mapper?
public interface CityDao {
//    @Select("SELECT * FROM city")
    @Select("SELECT * FROM city where city_name = #{cityName}")

    @Results({
//            @Results(property = "id", column = "id"),
            @Result(property = "id",column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName);
}