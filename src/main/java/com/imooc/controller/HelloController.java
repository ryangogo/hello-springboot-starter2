package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/13.
 */

public class HelloController {

    @RequestMapping
    public String hello(){
        return "hello springboot";
    }

}
