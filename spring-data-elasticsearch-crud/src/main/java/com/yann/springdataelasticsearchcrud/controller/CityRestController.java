package com.yann.springdataelasticsearchcrud.controller;

import com.yann.springdataelasticsearchcrud.domain.City;
import com.yann.springdataelasticsearchcrud.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市 Controller 实现 Restful HTTP 服务
 * @author: Yann
 * @create: 2019-04-03 18:23
 **/
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    /**
    * @Description: 插入 ES 新城市
    * @Param: [city]
    * @return: java.lang.Long
    * @Author: Yann
    * @date 2019/4/3 18:26
    */
    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public Long createCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    /** 
    * @Description: AND 语句查询 
    * @Param: [description, score] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 18:38
    */ 
    @RequestMapping(value = "/api/city/and/find", method = RequestMethod.GET)
    public List<City> findByDescriptionAndScore(@RequestParam(value = "description") String description,
                                                @RequestParam(value = "score") Integer score){
        return cityService.findByDescriptionAndScore(description,score);
    }

    /** 
    * @Description: OR 语句查询 
    * @Param: [description, score] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 18:39
    */ 
    @RequestMapping(value = "/api/city/or/find",method = RequestMethod.GET)
    public List<City> findByDescriptionOrScore(@RequestParam(value = "description") String description,
                                               @RequestParam(value = "score") Integer score){
        return cityService.findByDescriptionOrScore(description,score);
    }

    /** 
    * @Description:  查询城市描述
    * @Param: [description] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 18:39
    */ 
    @RequestMapping(value = "/api/city/description/find",method = RequestMethod.GET)
    public List<City> findByDescription(@RequestParam(value = "description") String description){
        return cityService.findByDescription(description);
    }

    /** 
    * @Description: NOT 语句查询 
    * @Param: [description] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 18:39
    */ 
    @RequestMapping(value = "/api/city/description/not/find",method = RequestMethod.GET)
    public List<City> findByDescriptionNot(@RequestParam(value = "description") String description){
        return cityService.findByDescriptionNot(description);
    }

    /** 
    * @Description: LIKE 语句查询 
    * @Param: [description] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 18:39
    */ 
    @RequestMapping(value = "/api/city/like/find",method = RequestMethod.GET)
    public List<City> findByDescriptionLike(@RequestParam(value = "description") String description){
        return cityService.findByDescriptionLike(description);
    }

}
