package com.example.createautotablesmysqlusingspringboothibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.createautotablesmysqlusingspringboothibernate.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
