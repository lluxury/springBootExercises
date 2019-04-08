package com.yann.springdataelasticsearchquery.controller;

import com.yann.springdataelasticsearchquery.domain.City;
import com.yann.springdataelasticsearchquery.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市 Controller 实现 Restful HTTP 服务
 * @author: Yann
 * @create: 2019-04-08 15:45
 **/
@RestController
public class CityRestController {
    
    @Autowired
    private CityService cityService;
    
    /** 
    * @Description:  插入 ES 新城市
    * @Param: [city] 
    * @return: long 
    * @Author: Yann 
    * @date 2019/4/8 15:48
    */ 
    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public long createCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city/search", method = RequestMethod.GET)
    public List<City> searchCity (@RequestParam(value = "pageNumber") Integer pageNumber,
                                  @RequestParam(value = "pageSize", required = false ) Integer pageSize,
                                  @RequestParam(value = "searchContent") String searchContent){
        return cityService.searchCity(pageNumber,pageSize,searchContent);
    }

    
}
