package com.yann.springbootelasticsearch.repository;

import com.yann.springbootelasticsearch.domain.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: demo3
 * @description: 仓库 dao?
 * @author: Yann
 * @create: 2019-04-02 16:55
 **/
@Repository
public interface CityRepository extends ElasticsearchRepository<City, Long> {
}
