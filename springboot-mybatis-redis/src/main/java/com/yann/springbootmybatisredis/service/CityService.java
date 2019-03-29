package com.yann.springbootmybatisredis.service;

import com.yann.springbootmybatisredis.domain.City;

/**
 * @program: demo3
 * @description: 城市业务逻辑接口类
 * @author: Yann
 * @create: 2019-03-29 15:44
 **/
public interface CityService {

    /**
    * @Description: 根据城市 ID,查询城市信息
    * @Param: [id]
    * @return: com.yann.springbootmybatisredis.domain.City
    * @Author: Yann
    * @date 2019/3/29 15:46
    */
    City findCityById(Long id);

    /** 
    * @Description: 新增城市信息 
    * @Param: [city] 
    * @return: java.lang.Long 
    * @Author: Yann 
    * @date 2019/3/29 15:46
    */ 
    Long saveCity(City city);

    /** 
    * @Description: 更新城市信息
    * @Param: [city] 
    * @return: java.lang.Long 
    * @Author: Yann 
    * @date 2019/3/29 15:46
    */ 
    Long updateCity(City city);

    /**
    * @Description: 根据城市 ID,删除城市信息
    * @Param: [id]
    * @return: java.lang.Long
    * @Author: Yann
    * @date 2019/3/29 15:47
    */
    Long deleteCity(Long id);
}
