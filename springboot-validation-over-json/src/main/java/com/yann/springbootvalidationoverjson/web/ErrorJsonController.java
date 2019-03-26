package com.yann.springbootvalidationoverjson.web;

import com.yann.springbootvalidationoverjson.constant.CityErrorInfoEnum;
import com.yann.springbootvalidationoverjson.result.GlobalErrorInfoException;
import com.yann.springbootvalidationoverjson.result.ResultBody;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo3
 * @description: 错误码案例
 * @author: Yann
 * @create: 2019-03-26 14:58
 **/
@RestController
public class ErrorJsonController {

    @RequestMapping(value = "/api/city",method = RequestMethod.GET)
    public ResultBody findOneCity(@RequestParam("cityName") String cityName) throws GlobalErrorInfoException{

//        入参为空
        if(StringUtils.isEmpty(cityName)){
            throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        return new ResultBody(new City(1L,2L,"Jn","是我的故乡"));
    }
}
