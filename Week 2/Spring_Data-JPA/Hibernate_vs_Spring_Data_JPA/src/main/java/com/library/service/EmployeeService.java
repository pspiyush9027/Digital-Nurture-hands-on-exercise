package com.library.service;

import com.library.model.Employee;
import com.library.repository.EmployeeRepository;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public void addEmployee(Employee employee) {
        System.out.println("Spring Data JPA style:");
        System.out.println("Repository save -> " + employee.getName());
        employeeRepository.save(employee);
    }
}
