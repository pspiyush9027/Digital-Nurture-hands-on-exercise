package com.library;

import com.library.hibernate.EmployeeHibernateService;
import com.library.model.Employee;

public class ComparisonDemo {

    public static void main(String[] args) {
        Employee employee = new Employee("Aman", "IT");
        EmployeeHibernateService hibernateService = new EmployeeHibernateService();
        hibernateService.addEmployee(employee);

        System.out.println();
        System.out.println("Spring Data JPA keeps the save call smaller and lets Spring manage the boilerplate.");
    }
}
