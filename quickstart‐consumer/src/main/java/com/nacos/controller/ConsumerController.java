package com.nacos.controller;

import com.nacos.feign.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: fandp
 * @create: 2020-02-26 10:08
 **/
@RestController
public class ConsumerController {
    private static final Logger LOG = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ProviderClient providerClient;
    @GetMapping("/service")
    public String service(){
        LOG.info("consumer invoke");
        String providerResult = providerClient.service();
        return "consumer invoke" + "|" + providerResult;
    }
}
