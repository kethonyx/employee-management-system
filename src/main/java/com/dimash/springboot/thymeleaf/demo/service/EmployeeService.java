package com.dimash.springboot.thymeleaf.demo.service;

import com.dimash.springboot.thymeleaf.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
