package com.se.bt1_nguyenthanhtu_18045511.repository;

import com.se.bt1_nguyenthanhtu_18045511.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Test
    void contextLoads() {
    }

    @Autowired
    private StudentRepository repository;

    //-----------------------------------Insert---------------------------------
//    @Test
//    public void insertNewStudent(){
//        Student s = Student.builder().name("John").age(15).build();
//        repository.save(s);
//    }

//    @Test
//    public void insertStudent2(){
//        repository.addStudent1("Tom",18);
//    }
    //----------------------------------Read--------------------------------------
//    @Test
//    public void findAllStudent(){
//        List<Student> students = (List<Student>) repository.findAll();
//        students.forEach(s->{System.out.println(s);});
//    }

//    @Test
//    public void findAllStudent_2(){
//        List<Student> students=repository.findAllStudent2();
//        students.forEach(s->{System.out.println(s);});
//    }

//    @Test
//    public void findAllStudent_3(){
//        List<Student> students = repository.findAllStudent3("Tom");
//        students.forEach(s->{System.out.println(s);});
//    }

    //




}