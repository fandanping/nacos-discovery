package com.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: fandp
 * @create: 2020-02-26 09:54
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosProvierApp {
    public static void main(String[] args){
        SpringApplication.run(NacosProvierApp.class,args);
    }
}
