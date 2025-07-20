package com.jihan.cruddemo.service;

import com.jihan.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findrAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
