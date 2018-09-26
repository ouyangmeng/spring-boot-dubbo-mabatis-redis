package com.ouym.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 16:08 2018/9/26
 * @Modified By:
 */
@SpringBootApplication
@ImportResource({"classpath:conf/dubbo-consumer.xml"})
public class ConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
