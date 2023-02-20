package com.example.Employee.service;

import com.example.Employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeMethods {
    Employee addEmployee(Employee employee);

    List<Employee> showAllEmployee();


    Optional<Employee> employeeInfo(int id);

}
