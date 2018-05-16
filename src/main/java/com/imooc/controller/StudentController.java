package com.imooc.controller;

import com.imooc.Service.StudentService;
import com.imooc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/14.
 */

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getById")
    public Student getById(){
        return studentService.getStudentById(1);
    }

}
