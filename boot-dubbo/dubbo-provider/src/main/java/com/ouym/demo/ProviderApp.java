package com.ouym.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 16:08 2018/9/26
 * @Modified By:
 */
@SpringBootApplication
@ImportResource({"classpath:conf/dubbo-provider.xml"})
@EnableCaching
@EnableTransactionManagement
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
