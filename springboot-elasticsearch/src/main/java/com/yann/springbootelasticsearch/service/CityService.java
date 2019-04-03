package com.yann.springbootelasticsearch.service;

import com.yann.springbootelasticsearch.domain.City;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市服务接口
 * @author: Yann
 * @create: 2019-04-02 16:57
 **/
public interface CityService {
    
    /** 
    * @Description:  新增城市信息
    * @Param: [city] 
    * @return: java.lang.Long 
    * @Author: Yann 
    * @date 2019/4/2 16:58
    */ 
    Long saveCity(City city);

    /** 
    * @Description:  根据关键词，function score query 权重分分页查询
    * @Param: [pageNumber, pageSize, searchContent] 
    * @return: java.util.List<com.yann.springbootelasticsearch.domain.City> 
    * @Author: Yann 
    * @date 2019/4/2 17:01
    */ 
    List<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent);
}
