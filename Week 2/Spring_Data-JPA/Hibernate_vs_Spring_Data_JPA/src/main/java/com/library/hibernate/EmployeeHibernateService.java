package com.library.hibernate;

import com.library.model.Employee;

public class EmployeeHibernateService {

    public Integer addEmployee(Employee employee) {
        System.out.println("Hibernate style:");
        System.out.println("Open session");
        System.out.println("Begin transaction");
        System.out.println("Save employee -> " + employee.getName());
        System.out.println("Commit transaction");
        System.out.println("Close session");
        return 101;
    }
}
