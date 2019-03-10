package com.wish.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lc
 * @describe 功能描述
 * @Date 14:24 on 2019/3/10
 */


@RestController
public class EurekaController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hello(@RequestParam(value = "name") String name) {
        return "i'm " + name + ",i am from port:" + port;
    }

}
