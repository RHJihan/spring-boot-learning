package com.jihan.cruddemo.service;

import com.jihan.cruddemo.dao.EmployeeRepository;
import com.jihan.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {

        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findrAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee theEmployee = null;
        if (result.isPresent()) {
            theEmployee = result.get();
        }else {
            throw new RuntimeException("Employee not found: " + id);
        }
        return theEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);

    }
}
