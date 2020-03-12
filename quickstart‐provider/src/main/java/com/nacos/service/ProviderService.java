package com.nacos.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: fandp
 * @create: 2020-02-26 09:53
 **/
//@RefreshScope  刷新整个配置文件
@RestController
@RefreshScope
public class ProviderService {
    private static final Logger LOG = LoggerFactory.getLogger(ProviderService.class);
    @Autowired
    private ConfigurableApplicationContext applicationContext;
    @Value("${common.name}")
    private String name;
    @Value("${common.age}")
    private String age;

    @GetMapping("/service")
    public String service(){
        LOG.info("provider invoke");
        //String name = applicationContext.getEnvironment().getProperty("common.name");
        System.out.println(name);
        //String age = applicationContext.getEnvironment().getProperty("common.age");
        String address = applicationContext.getEnvironment().getProperty("common.address");
        String birthday= applicationContext.getEnvironment().getProperty("common.birthday");
        String fullname = applicationContext.getEnvironment().getProperty("common.fullname");
        return name+"+"+ age+"+"+address+"+"+ birthday+"+"+ fullname;
    }
}