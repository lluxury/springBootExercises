package com.yann.springdataelasticsearchquery.repository;

//import com.yann.springdataelasticsearchcrud.domain.City;
import com.yann.springdataelasticsearchquery.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

//import java.awt.print.Pageable;

/**
 * @program: demo3
 * @description: ES 操作类
 * @author: Yann
 * @create: 2019-04-03 17:34
 **/
public interface CityRepository extends ElasticsearchRepository<City, Long> {

}
