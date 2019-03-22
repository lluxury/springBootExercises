package com.yann.springboothelloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test helloworld
 *
 * yann
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String SayHello(){
        return "Hello,World!";
    }
}
