package com.yann.springboothelloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo3
 * @description: hello world example
 * @author: Yann
 * @create: 2019-03-23 12:21
 **/
@RestController
public class HelloWorldController {

    /**
    * @Description: say hello
    * @Param: []
    * @return: java.lang.String
    * @Author: Yann
    * @Date:
    * @Time:
    */
    @RequestMapping("/")
    public String sayHello(){
        return "Hello,World!";
    }

}
