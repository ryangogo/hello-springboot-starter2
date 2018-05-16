package com.imooc.Service;

import com.imooc.pojo.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/5/14.
 */
public interface StudentService {

    Student getStudentById(Integer id);

    public void saveUser(Student student) throws Exception;

    public void updateUser(Student student);

    public void deleteUser(Integer id);

    public Student queryUserById(String userId);

    public List<Student> queryUserList(Student student);

    public List<Student> queryUserListPaged(Student student, Integer page, Integer pageSize);

    public Student queryUserByIdCustom(String stuId);

    public void saveUserTransactional(Student student);

}
