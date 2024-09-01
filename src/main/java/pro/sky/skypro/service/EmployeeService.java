package pro.sky.skypro.service;

import pro.sky.skypro.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String secondName);

    Employee remove(String firstName, String secondName);

    Employee find(String firstName, String secondName);

    Collection<Employee> findAll();
}
