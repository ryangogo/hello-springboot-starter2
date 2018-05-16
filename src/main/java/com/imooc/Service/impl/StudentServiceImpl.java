package com.imooc.Service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imooc.Service.StudentService;
import com.imooc.mapper.StudentMapper;
import com.imooc.pojo.Student;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by Administrator on 2018/5/14.
 */
@Service
class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public void saveUser(Student student) throws Exception {
        int insert = studentMapper.insert(student);
    }

    @Override
    public void updateUser(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public void deleteUser(Integer id) {
        int i = studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public Student queryUserById(String userId) {
        Student student = studentMapper.selectByPrimaryKey(userId);
        return student;
    }

    @Override
    public List<Student> queryUserList(Student student) {

        return null;
    }

    @Override
    public List<Student> queryUserListPaged(Student student, Integer page, Integer pageSize) {
        //开始分页
        PageHelper.startPage(page,pageSize);
        List<Student> students = studentMapper.selectByExample(student);
        //将查询结果附加上pageNum，pageSize，startRow等查询条件
        PageInfo pageResult = new PageInfo(students);
        pageResult.setList(students);
        return students;
    }

    @Override
    public Student queryUserByIdCustom(String stuId) {
        return null;
    }

    @Override
    public void saveUserTransactional(Student student) {

    }

    public Integer updateStudent(Student stu){
        Integer i = studentMapper.updateByPrimaryKeySelective(stu);
        return i;
    }


}
