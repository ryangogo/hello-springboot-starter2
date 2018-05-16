package com.imooc.controller;

import com.imooc.exception.TestException;
import com.imooc.pojo.Resource;
import com.imooc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/5/13.
 */
@Controller
@RequestMapping("/test/")
public class TestController {

    @Autowired
    private Resource resource;

    /*@Autowired
    private StudentService studentService;*/

    /**
     * 测试返回到thymeleaf的接口
     * @return
     */
    @RequestMapping("testThymeleaf")
    public String testThymeleaf(Model model){
        User user = new User();
        user.setName("imooc");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setPassword("imooc");
        user.setDesc("<font color='green'><b>hello imooc</b></font>");
        model.addAttribute("user",user);

        User user2 = new User();
        user.setName("imooc");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setPassword("imooc");
        User user3 = new User();
        user.setName("imooc");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setPassword("imooc");
        List list = new ArrayList<User>();
        list.add(user2);
        list.add(user3);
        model.addAttribute("userList",list);
        return "test";
    }

    @PostMapping("postform")
    public String postform(User user){
        System.out.println(user.getName() + " " + user.getAge());
        return "redirect:testThymeleaf";
    }


    @RequestMapping("moveToException")
    public String moveToException(Model model)throws TestException {
        try{
            if(true){
                throw new TestException("发生了异常");
            }
            return null;
        }catch (TestException e){
            throw e;
        }
    }

    /*@RequestMapping("getStudentById")
    public void getStudentById(){
        Student student = studentService.selectById(1);
        System.out.println(student.getName() + "" + student.getAge());
    }*/

}
