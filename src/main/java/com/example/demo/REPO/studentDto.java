package com.example.demo.REPO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entiry.Student;

public interface studentDto extends JpaRepository<Student, Integer>{

}
