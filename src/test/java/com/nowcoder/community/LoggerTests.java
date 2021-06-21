package com.nowcoder.community;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTests {
    //通常传递当前类的类名LoggerTests.class，那不同不同的Logger在不同的类下会有一定区分，
    // 知道这个Logger是属于哪个地方的
    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testLogger() {

        System.out.println(logger.getName());

        logger.debug("debug.log");
        logger.info("info.log");
        logger.warn("warn.log");
        logger.error("error.log");

    }


}
