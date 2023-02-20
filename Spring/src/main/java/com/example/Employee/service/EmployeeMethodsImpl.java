package com.example.Employee.service;

import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeMethodsImpl implements EmployeeMethods {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeMethodsImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {

        return this.employeeRepository.saveAndFlush(employee);
    }

    @Override
    public List<Employee> showAllEmployee() {

        return this.employeeRepository.findAll();
    }


    @Override
    public Optional<Employee> employeeInfo(int id) {
        //gojamil
        return this.employeeRepository.findById(String.valueOf(id));


    }
}
