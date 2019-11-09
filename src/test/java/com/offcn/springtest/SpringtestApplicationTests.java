package com.offcn.springtest;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
class SpringtestApplicationTests {

    @Resource
    private DataSource dataSource;

    @Test
    void contextLoads() {
        System.out.println(dataSource+"====");
    }

}
