package pro.sky.skypro.service;

import pro.sky.skypro.model.Employee;

public interface EmployeeService {
    Employee add(String firstName, String secondName);
    Employee mremove(String firstName, String secondName);
    Employee nfind(String firstName, String secondName);

}
