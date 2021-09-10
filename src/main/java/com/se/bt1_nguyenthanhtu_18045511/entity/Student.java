package com.se.bt1_nguyenthanhtu_18045511.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Student {
    @Id
    @GeneratedValue
    private long studentId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

}
