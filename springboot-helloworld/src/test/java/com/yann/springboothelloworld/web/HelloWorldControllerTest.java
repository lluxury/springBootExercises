package com.yann.springboothelloworld.web;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  HelloWorldController test  {@link HelloWorldController}
 */
public class HelloWorldControllerTest {

    @Test
    public void sayHello() {
        assertEquals("Hello,World!",new HelloWorldController().SayHello());
    }
}