package com.imooc.Service.impl; 

import com.imooc.ImoocApplication;
import com.imooc.Service.StudentService;
import com.imooc.pojo.Student;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/** 
* StudentServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 14, 2018</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ImoocApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class StudentServiceImplTest { 

    @Autowired
    private StudentService studentService;

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    } 

    /**
    * 
    * Method: getStudentById(Integer id) 
    * 
    */ 
    @Test
    public void testGetStudentById() throws Exception {
        Student studentById = studentService.getStudentById(1);
        System.out.println(studentById.getName());
    } 

    /** 
    * 
    * Method: saveUser(Student student) 
    * 
    */ 
    @Test
    public void testSaveUser() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: updateUser(Student student) 
    * 
    */ 
    @Test
    public void testUpdateUser() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: deleteUser(Integer id) 
    * 
    */ 
    @Test
    public void testDeleteUser() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: queryUserById(String userId) 
    * 
    */ 
    @Test
    public void testQueryUserById() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: queryUserList(Student student) 
    * 
    */ 
    @Test
    public void testQueryUserList() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: queryUserListPaged(Student student, Integer page, Integer pageSize) 
    * 
    */ 
    @Test
    public void testQueryUserListPaged() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: queryUserByIdCustom(String stuId) 
    * 
    */ 
    @Test
    public void testQueryUserByIdCustom() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: saveUserTransactional(Student student) 
    * 
    */ 
    @Test
    public void testSaveUserTransactional() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: updateStudent(Student stu) 
    * 
    */ 
    @Test
    public void testUpdateStudent() throws Exception { 
        //TODO: Test goes here... 
    }

}
