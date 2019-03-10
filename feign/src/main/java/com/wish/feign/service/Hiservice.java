package com.wish.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lc
 * @describe 功能描述
 * @Date 15:53 on 2019/3/10
 */
@FeignClient(value = "service-hi")
public interface Hiservice {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name") String name);
}
