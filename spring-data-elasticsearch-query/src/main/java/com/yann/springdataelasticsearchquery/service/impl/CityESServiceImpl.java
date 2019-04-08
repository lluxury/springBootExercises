package com.yann.springdataelasticsearchquery.service.impl;

//import com.yann.springdataelasticsearchcrud.domain.City;
//import com.yann.springdataelasticsearchcrud.repository.CityRepository;
//import com.yann.springdataelasticsearchcrud.service.CityService;
import com.yann.springdataelasticsearchquery.domain.City;
import com.yann.springdataelasticsearchquery.repository.CityRepository;
import com.yann.springdataelasticsearchquery.service.CityService;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;
import sun.security.mscapi.SunMSCAPI;

import java.util.List;



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
//    private static final Integer pageNumber = 0;
//    private static final Integer pageSize = 10;
//    Pageable pageable = new PageRequest(pageNumber, pageSize);
    Integer PAGE_SIZE = 12; // 每页数量
    Integer DEFAULT_PAGE_NUMBER = 0;  //默认当前页码

//    搜索模式
    String SCORE_MODE_SUM = "sum"; // 权重分求和模式
    Float MIN_SCORE =  10.0F; // 由于无相关性的分值默认为 1 ，设置权重分最小值为 10

    @Autowired
    CityRepository cityRepository; // ES操作类


    public Long saveCity(City city){
        City cityResult = cityRepository.save(city);
//        初始化类型,调用方法
        return  cityResult.getId();
    }

    @Override
    public List<City> searchCity(Integer pageNumber,Integer pageSize, String searchContent){

        if (pageSize == null || pageSize <=0){
            pageSize = PAGE_SIZE;
        }

        if (pageNumber == null || pageNumber < DEFAULT_PAGE_NUMBER){
            pageNumber = DEFAULT_PAGE_NUMBER;
        }

        LOGGER.info("\n searchCity: searchContent [" + searchContent + "] \n");

        // 构建搜索查询
        SearchQuery searchQuery = getCitySearchQuery(pageNumber,pageSize,searchContent);

        LOGGER.info("\n searchCity: searchContent [" + searchContent + "] \n DSL  = \n " + searchQuery.getQuery().toString());

        Page<City> cityPage = cityRepository.search(searchQuery);
        return cityPage.getContent();

    }

    /** 
    * @Description:  根据搜索词构造搜索查询语句
    * 代码流程：
     *      - 权重分查询
     *      - 短语匹配
     *      - 设置权重分最小值
     *      - 设置分页参数
    * @Param: [pageNumber, pageSize, searchContent] 
    * @return: org.springframework.data.elasticsearch.core.query.SearchQuery 
    * @Author: Yann 
    * @date 2019/4/8 17:04
    */ 
    private SearchQuery getCitySearchQuery(Integer pageNumber, Integer pageSize, String searchContent){
        // 短语匹配到的搜索词，求和模式累加权重分
        // 权重分查询 https://www.elastic.co/guide/cn/elasticsearch/guide/current/function-score-query.html
        //   - 短语匹配 https://www.elastic.co/guide/cn/elasticsearch/guide/current/phrase-matching.html
        //   - 字段对应权重分设置，可以优化成 enum
        //   - 由于无相关性的分值默认为 1 ，设置权重分最小值为 10 ,还是不明
        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
                .add(QueryBuilders.matchPhraseQuery("name", searchContent),
                        ScoreFunctionBuilders.weightFactorFunction(1000))
                .add(QueryBuilders.matchPhraseQuery("description",searchContent),
                        ScoreFunctionBuilders.weightFactorFunction(500))
                .scoreMode(SCORE_MODE_SUM).setMinScore(MIN_SCORE);

        // 分页参数
        Pageable pageable = new PageRequest(pageNumber,pageSize);
        return new NativeSearchQueryBuilder()
                .withPageable(pageable)
                .withQuery(functionScoreQueryBuilder).build();

    }

}
