package com.yann.springbootmybatisannotation.controller;

import com.yann.springbootmybatisannotation.domain.City;
import com.yann.springbootmybatisannotation.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demo3
 * @description: 城市 Controller 实现 Restful HTTP 服务
 * @author: Yann
 * @create: 2019-03-25 14:29
 **/
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

//    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
//    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
//        return cityService.findCityByName(cityName);
//    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName){
        return cityService.findCityByName(cityName);
    }
}
