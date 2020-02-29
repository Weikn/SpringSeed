package com.aweikn.springseed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.aweikn.springseed.mapper") //扫描的mapper
@SpringBootApplication()
//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class SpringseedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringseedApplication.class, args);
    }

}
