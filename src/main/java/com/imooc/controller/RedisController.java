package com.imooc.controller;

import com.imooc.common.IMoocJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/16.
 */

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("test")
    public IMoocJSONResult test(){
        stringRedisTemplate.opsForValue().set("imooc","hello springboot");
        return IMoocJSONResult.ok(stringRedisTemplate.opsForValue().get("imooc"));
    }


}
