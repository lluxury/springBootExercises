package com.yann.springdataelasticsearchcrud.service;

import com.yann.springdataelasticsearchcrud.domain.City;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市 ES 业务接口类
 * @author: Yann
 * @create: 2019-04-03 17:50
 **/
public interface CityService {

    /** 
    * @Description: 新增 ES 城市信息
    * @Param: [city] 
    * @return: java.lang.Long 
    * @Author: Yann 
    * @date 2019/4/3 17:55
    */ 
    Long saveCity(City city);

    /**
    * @Description:AND 语句查询
    * @Param: [description, score]
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City>
    * @Author: Yann
    * @date 2019/4/3 17:55
    */
//    List<City> findByDescriptionAndSore(String description, Integer score);
    List<City> findByDescriptionAndScore(String description, Integer score);
    /** 
    * @Description:  OR 语句查询
    * @Param: [description, score] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 17:55
    */ 
    List<City> findByDescriptionOrScore(String description, Integer score);

    /** 
    * @Description: 查询城市描述 
    * @Param: [description] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 17:56
    */ 
    List<City> findByDescription(String description);

    /** 
    * @Description: NOT 语句查询
    * @Param: [description] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 17:56
    */ 
    List<City> findByDescriptionNot(String description);

    /**
    * @Description: LIKE 语句查询
    * @Param: [description]
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City>
    * @Author: Yann
    * @date 2019/4/3 17:56
    */
    List<City> findByDescriptionLike(String description);


}
