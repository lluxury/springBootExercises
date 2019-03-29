package com.yann.springbootmybatismutildatasource.dao.cluster;

import com.yann.springbootmybatismutildatasource.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市 DAO 接口类
 * @author: Yann
 * @create: 2019-03-25 14:09
 **/
//@Mapper  // 开放试一下
public interface CityDao {
    City findByName(@Param("cityName") String cityName);    // 使用属性名和数据库字段无关了
}
