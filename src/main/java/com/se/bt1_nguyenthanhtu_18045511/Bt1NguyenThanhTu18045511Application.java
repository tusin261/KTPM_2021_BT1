package com.se.bt1_nguyenthanhtu_18045511;

import com.se.bt1_nguyenthanhtu_18045511.entity.Student;
import com.se.bt1_nguyenthanhtu_18045511.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bt1NguyenThanhTu18045511Application {

    public static void main(String[] args) {
        SpringApplication.run(Bt1NguyenThanhTu18045511Application.class, args);
    }

//    @Bean
//    public CommandLineRunner run(StudentRepository repository){
//        return args -> {
//            insertNewStudent(repository);
//        };
//    }
//    private void insertNewStudent(StudentRepository repository){
//        Student s = Student.builder().name("An").age(15).build();
//        System.out.println("hello");
//        repository.save(s);
//    }

}
