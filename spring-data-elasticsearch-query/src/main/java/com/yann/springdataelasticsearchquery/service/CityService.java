package com.yann.springdataelasticsearchquery.service;

//import com.yann.springdataelasticsearchcrud.domain.City;

import com.yann.springdataelasticsearchquery.domain.City;

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
    * @Description:  搜索词搜索，分页返回城市信息
    * @Param: [pageNumber, pageSize, searchContent]
     *          当前页码,每页大小,搜索内容
    * @return: java.util.List<com.yann.springdataelasticsearchquery.domain.City> 
    * @Author: Yann 
    * @date 2019/4/8 15:07
    */ 
    List<City> searchCity (Integer pageNumber, Integer pageSize, String searchContent);


}
