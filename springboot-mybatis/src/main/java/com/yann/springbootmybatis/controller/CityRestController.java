package com.yann.springbootmybatis.controller;

//import com.yann.springbootrestful.domain.City;
//import com.yann.springbootrestful.service.CityService;
import com.yann.springbootmybatis.domain.City;
import com.yann.springbootmybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value ="/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id){
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    @RequestMapping(value = "/api/city/{cityName}",method = RequestMethod.GET)
    public City findCityByName(@PathVariable("cityName") String cityName){return cityService.findCityByName(cityName);}

//    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
//    public List<City> findAllCity(){
//        return cityService.findAllCity();
//    }

    @RequestMapping(value = "/api/city",method = RequestMethod.POST)
    public void createCity(@RequestBody City city){
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city){
        cityService.updateCity(city);
    }

//    @RequestMapping(value = "/api/city",method = RequestMethod.DELETE)
//    public void deleteCity(@PathVariable("id")  Long id){
//        cityService.deleteCity(id);
//    deleteCity 貌似不支持
//    }
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
