package com.assignment.wander.covid19dashboard.service;

import com.assignment.wander.covid19dashboard.model.Employee;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class EmployeeHardCodedService {

    private static List<Employee> employees = new LinkedList<>();
    private static int idCounter = 0;

    static {
        employees.add(new Employee(++idCounter, "Raghavendra M J", "Lead Developer", 300000));
        employees.add(new Employee(++idCounter, "Keshav", "Senior Technician", 25000));
        employees.add(new Employee(++idCounter, "Utkarsh", "Technical Associate", 15000));
        employees.add(new Employee(++idCounter, "Syed Yaqub", "Technical Associate", 15000));
    }

    public List<Employee> findAll() {
        return employees;
    }

    public Employee deleteById(long id) {
        Employee Employee = findById(id);

        if (Employee == null || !employees.remove(Employee))
            return null;

        return Employee;
    }

    public Employee save(Employee Employee) {
        if (Employee.getEmpId() == -1 || Employee.getEmpId() == 0) {
            Employee.setEmpId(++idCounter);
            employees.add(Employee);
        } else {
            deleteById(Employee.getEmpId());
            employees.add(Employee);
        }
        return Employee;
    }

    public Employee findById(long id) {
        return employees.stream().filter(eachEmployee -> eachEmployee.getEmpId() == id).findFirst().orElse(null);
    }

}
