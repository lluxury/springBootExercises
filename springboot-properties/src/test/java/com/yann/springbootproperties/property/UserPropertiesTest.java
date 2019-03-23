package com.yann.springbootproperties.property;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPropertiesTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserPropertiesTest.class);

    @Autowired
    private UserProperties userProperties;

    @Test
    public void randomTestUser(){
        LOGGER.info(userProperties.toString());
    }

}