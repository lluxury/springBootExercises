package com.yann.springdataelasticsearchcrud.repository;

import com.yann.springdataelasticsearchcrud.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

//import java.awt.print.Pageable;

import java.util.List;

/**
 * @program: demo3
 * @description: ES 操作类
 * @author: Yann
 * @create: 2019-04-03 17:34
 **/
public interface CityRepository extends ElasticsearchRepository<City, Long> {

    /** 
    * @Description: AND 语句查询 
    * @Param: [description, score] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 17:41
    */ 
    List<City> findByDescriptionAndScore(String description, Integer score);

    /** 
    * @Description: OR 语句查询
    * @Param: [description, score] 
    * @return: java.util.List<com.yann.springdataelasticsearchcrud.domain.City> 
    * @Author: Yann 
    * @date 2019/4/3 17:41
    */ 
    List<City> findByDescriptionOrScore(String description, Integer score);

    /**
    * @Description: 查询城市描述
     *  @Query("{\"bool\" : {\"must\" : {\"term\" : {\"description\" : \"?0\"}}}}") 没看懂
     *  Page<City> findByDescription(String description, Pageable pageable);
    * @Param: [description, page]
    * @return: org.springframework.data.domain.Page<com.yann.springdataelasticsearchcrud.domain.City>
    * @Author: Yann
    * @date 2019/4/3 17:41
    */
    Page<City> findByDescription(String description, Pageable page);

    /**
    * @Description: NOT 语句查询
    * @Param: [description, page]
    * @return: org.springframework.data.domain.Page<com.yann.springdataelasticsearchcrud.domain.City>
    * @Author: Yann
    * @date 2019/4/3 17:43
    */
    Page<City> findByDescriptionNot(String description, Pageable page);

    /**
    * @Description: LIKE 语句查询
    * @Param: [description, page]
    * @return: org.springframework.data.domain.Page<com.yann.springdataelasticsearchcrud.domain.City>
    * @Author: Yann
    * @date 2019/4/3 17:43
    */
    Page<City> findByDescriptionLike(String description, Pageable page);
}
