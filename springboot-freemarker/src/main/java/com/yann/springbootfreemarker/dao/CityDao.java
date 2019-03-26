package com.yann.springbootfreemarker.dao;

import com.yann.springbootfreemarker.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: demo3
 * @description: 获取城市信息列表
 * @author: Yann
 * @create: 2019-03-25 19:47
 **/
public interface CityDao {
    /** 
    * @Description:  
    * @Param: [] 
    * @return: java.util.List<com.yann.springbootfreemarker.domain.City> 
    * @Author: Yann 
    * @Date: 
    * @Time: 
    */ 
    List<City> findAllCity();
    
    /** 
    * @Description:  
    * @Param: [id] 
    * @return: com.yann.springbootfreemarker.domain.City 
    * @Author: Yann 
    * @Date: 
    * @Time: 
    */ 
    City findById(@Param("id") Long id);
    
    Long saveCity(City city);
    
    Long updateCity(City city);
    
    Long deleteCity(Long id);
    
}
