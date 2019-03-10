package com.wish.feign.controller;

import com.wish.feign.service.Hiservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lc
 * @describe 功能描述
 * @Date 15:53 on 2019/3/10
 */
@RestController
public class FeignCotroller {

    @Autowired
    private Hiservice hiservice;

    @RequestMapping("/sayHi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return hiservice.sayHi(name);
    }
}
