package pro.sky.skypro.service;

import org.springframework.stereotype.Service;
import pro.sky.skypro.exception.EmployeeAlreadyAddedException;
import pro.sky.skypro.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }


    @Override
    public Employee remove(String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeAlreadyAddedException();
    }


    @Override
    public Employee find(String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);

        if (employeeList.contains(employee)) {
            return employee;
        }

        throw new EmployeeAlreadyAddedException();


    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableList(employeeList);
    }
}
