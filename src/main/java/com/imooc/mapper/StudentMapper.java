package com.imooc.mapper;

import com.imooc.pojo.Student;
import com.imooc.utils.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface StudentMapper extends MyMapper<Student> {

   Student selectByPrimaryId(@Param("id")Integer id);

}