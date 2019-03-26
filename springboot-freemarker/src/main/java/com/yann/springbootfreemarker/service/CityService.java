package com.yann.springbootfreemarker.service;

import com.yann.springbootfreemarker.domain.City;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市业务逻辑接口类
 * @author: Yann
 * @create: 2019-03-25 19:51
 **/
public interface CityService {

    /** 
    * @Description:  获取城市信息列表
    * @Param: [] 
    * @return: java.util.List<com.yann.springbootfreemarker.domain.City> 
    * @Author: Yann 
    * @Date: 
    * @Time: 
    */ 
    List<City> findAllCity();

    /** 
    * @Description:  根据城市 ID,查询城市信息
    * @Param: [id] 
    * @return: com.yann.springbootfreemarker.domain.City 
    * @Author: Yann 
    * @Date: 
    * @Time: 
    */ 
    City findCityById(Long id);

    /** 
    * @Description:  新增城市信息
    * @Param: [city] 
    * @return: java.lang.Long 
    * @Author: Yann 
    * @Date: 
    * @Time: 
    */ 
    Long saveCity(City city);
    
    /** 
    * @Description:  更新城市信息
    * @Param: [city] 
    * @return: java.lang.Long 
    * @Author: Yann 
    * @Date: 
    * @Time: 
    */ 
    Long updateCity(City city);

/** 
* @Description:  根据城市 ID,删除城市信息
* @Param: [id] 
* @return: java.lang.Long 
* @Author: Yann 
* @date 2019/3/25 22:57
*/
    Long deleteCity(Long id);
    

//    上一个是数据库的处理接口,这个是业务的处理接口
}
