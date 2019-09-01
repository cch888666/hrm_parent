package com.cch.hrm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cch.hrm.mapper")
@EnableSwagger2
public class SysManage9001Application {
    public static void main(String[] args) {
        SpringApplication.run(SysManage9001Application.class,args);
    }
}
