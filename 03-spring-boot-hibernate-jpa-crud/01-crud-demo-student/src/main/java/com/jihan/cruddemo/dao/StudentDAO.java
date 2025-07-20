package com.jihan.cruddemo.dao;

import com.jihan.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
