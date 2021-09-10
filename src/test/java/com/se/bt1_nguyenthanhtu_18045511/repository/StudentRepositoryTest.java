package com.se.bt1_nguyenthanhtu_18045511.repository;

import com.se.bt1_nguyenthanhtu_18045511.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

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

    //----------------------------------Update-----------------------------

//    @Test
//    public void updateStudent_1(){
//        Student s = repository.findStudentByName("Tom");
//        s.setStudentId(s.getStudentId());
//        s.setName("Tim");
//        s.setAge(s.getAge());
//        repository.save(s);
//    }

//    @Test
//    public void updateStudent_2(){
//        repository.UpdateStudentById("Tommy",Long.valueOf(3));
//    }

//    @Test
//    public void updateStudent_3(){
//        repository.UpdateStudentById2("Ken",Long.valueOf(2));
//    }

    //----------------------------Delete----------------------------

//    @Test
//    public void deleteStudent_1(){
//        repository.deleteById(Long.valueOf(4));
//    }

//    @Test
//    public void deleteStudent_2(){
//        repository.deleteStudent2(Long.valueOf(6));
//        System.out.println("Thanh cong");
//    }

//    @Test
//    public void deleteStudent_3(){
//        repository.deleteStudent3(Long.valueOf(7));
//        System.out.println("Thanh cong");
//    }




}