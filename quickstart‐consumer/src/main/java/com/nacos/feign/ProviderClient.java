package com.nacos.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 生产者远程代理协议
 * @author: fandp
 * @create: 2020-02-26 10:06
 **/
@FeignClient(name="quickstart-provider")
public interface ProviderClient {
    @GetMapping("/service")
    public String service();
}
