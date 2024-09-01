package pro.sky.skypro.service;

import org.springframework.stereotype.Service;
import pro.sky.skypro.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        employeeList.add(employee);
        return null;
    }

    @Override
    public Employee mremove(String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            }
        return null;
    }

    @Override
    public Employee nfind(String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);

        if (employeeList.contains(employee)) {
            return employee;
        }

        return null;

    }
}
