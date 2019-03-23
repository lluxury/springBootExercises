package com.yann.springbootproperties.property;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomePropertiesTest {

//    private static final Logger LOGGER = LoggerFactory.getLogger(HomePropertiesTest.class);

    @Autowired
    private HomeProperties homeProperties;

    @Test
    public void getHomeProperties(){
        Assert.assertEquals("Inner_Mongolia",homeProperties.getProvince());
        Assert.assertEquals("Jn",homeProperties.getCity());
    }
}