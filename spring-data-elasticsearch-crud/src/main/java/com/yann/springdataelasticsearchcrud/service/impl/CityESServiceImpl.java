package com.yann.springdataelasticsearchcrud.service.impl;

import com.yann.springdataelasticsearchcrud.domain.City;
import com.yann.springdataelasticsearchcrud.repository.CityRepository;
import com.yann.springdataelasticsearchcrud.service.CityService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

//import java.awt.print.Pageable;
import org.springframework.data.domain.Pageable;
import java.util.List;
import org.slf4j.Logger;
//import java.util.logging.Logger;

/**
 * @program: demo3
 * @description: 城市 ES 业务逻辑实现类
 * @author: Yann
 * @create: 2019-04-03 17:57
 **/
@Service
public class CityESServiceImpl implements CityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityESServiceImpl.class);

    // 分页参数 -> TODO 代码可迁移到具体项目的公共 common 模块
    private static final Integer pageNumber = 0;
    private static final Integer pageSize = 10;
    Pageable pageable = new PageRequest(pageNumber, pageSize);


    // ES 操作类
    @Autowired
    CityRepository cityRepository;

    public Long saveCity(City city){
        City cityResult = cityRepository.save(city);
//        初始化类型,调用方法
        return  cityResult.getId();
    }


    public List<City> findByDescriptionAndScore(String description, Integer score){
        return cityRepository.findByDescriptionAndScore(description, score);
    }

    public List<City> findByDescriptionOrScore(String description, Integer score){
        return cityRepository.findByDescriptionOrScore(description,score);
    }

    public List<City> findByDescription(String description){
        return cityRepository.findByDescription(description,pageable).getContent();
    }

    public List<City> findByDescriptionNot(String description){
        return cityRepository.findByDescriptionNot(description,pageable).getContent();
    }

    public List<City> findByDescriptionLike(String description){
        return cityRepository.findByDescriptionLike(description,pageable).getContent();
    }
}
