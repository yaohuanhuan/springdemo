package com.yaohh.springdemo.daoTest;


import com.yaohh.springdemo.mappers.ProductMapper;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yx on 2017/8/25.
 * hello
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class Test {

    @Autowired
    private ProductMapper productMapper;

    @org.junit.Test
    public void testDemo() {
        Logger logger = LoggerFactory.getLogger(Test.class);
        logger.info("logback 成功了1");
        logger.error("logback 成功了2");
        logger.debug("logback 成功了3");

    }
}
