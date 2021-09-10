package com.se.bt1_nguyenthanhtu_18045511.repository;

import com.se.bt1_nguyenthanhtu_18045511.entity.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

    Student findStudentByName(String name);
    //Insert = Native Query & JPQL
    @Transactional
    @Modifying
    @Query(value = "insert into student(name,age) value(:name,:age)",nativeQuery = true)
    void addStudent1(@Param("name") String name, @Param("age") int age);

    //Read = Native Query & JPQL
    @Query(value = "select * from student",nativeQuery = true)
    List<Student> findAllStudent2();

    @Query("select s from Student s where s.name = ?1")
    List<Student> findAllStudent3(String name);


    //Update = Native Query & JPQL
    @Transactional
    @Modifying
    @Query(value = "update student set name = :name where student_id=:id", nativeQuery = true)
    void UpdateStudentById(@Param("name") String name, @Param("id") long id);

    @Transactional
    @Modifying
    @Query("update Student s set s.name = :name where s.studentId = :id")
    void UpdateStudentById2(@Param("name") String name, @Param("id") long id);

}
