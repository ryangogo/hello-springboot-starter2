package com.imooc.controller;

import com.imooc.common.IMoocJSONResult;
import com.imooc.pojo.Resource;
import com.imooc.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2018/5/13.
 */

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private Resource resource;

    @RequestMapping("getUser")
    public User getUser(){
        User user = new User();
        user.setName("imooc2");
        user.setAge(19);
        user.setBirthday(new Date());
        user.setPassword("imooc2");
        return user;
    }

    @RequestMapping("getUserJson")
    public IMoocJSONResult getUserJson(){
        User user = new User();
        user.setName("imooc");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setPassword("imooc");
        return IMoocJSONResult.ok(user);
    }

    @RequestMapping("getResourceJson")
    public IMoocJSONResult getResourceJson(){
        Resource resourceBean = new Resource();
        BeanUtils.copyProperties(resource,resourceBean);
        return IMoocJSONResult.ok(resourceBean);
    }

    @RequestMapping("testThymeleaf")
    public IMoocJSONResult testThymeleaf(){
        Resource resourceBean = new Resource();
        BeanUtils.copyProperties(resource,resourceBean);
        return IMoocJSONResult.ok(resourceBean);
    }

}
