package com.yann.springbootfreemarker.controller;

import com.yann.springbootfreemarker.domain.City;
import com.yann.springbootfreemarker.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @program: demo3
 * @description: 城市 Controller 实现 Restful HTTP 服务
 * @author: Yann
 * @create: 2019-03-26 11:16
 **/
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public String findOneCity(Model model, @PathVariable("id") Long id){
        model.addAttribute("city", cityService.findCityById(id));
        return "city";
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public String findAllCity(Model model){
        List<City> cityList=cityService.findAllCity();
        model.addAttribute("cityList", cityList);
        return "cityList";
    }
}
