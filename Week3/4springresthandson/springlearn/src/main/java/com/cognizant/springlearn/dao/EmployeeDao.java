package com.cognizant.springlearn.dao;

import com.cognizant.springlearn.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.model.Skill;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeDao {

    private static final List<Employee> employeeList = new ArrayList<>();

    static {

        try {

            Department department = new Department(1, "Engineering");

            List<Skill> skills = Arrays.asList(
                    new Skill(1, "Java"),
                    new Skill(2, "Spring Boot")
            );

            employeeList.add(
                    new Employee(
                            1,
                            "Rahul",
                            65000.0,
                            true,
                            new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2001"),
                            department,
                            skills
                    )
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getEmployee(int id) {

        return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);

    }

    public void updateEmployee(Employee employee)
            throws EmployeeNotFoundException {

        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getId().equals(employee.getId())) {

                employeeList.set(i, employee);
                return;

            }

        }

        throw new EmployeeNotFoundException(
                "Employee not found with id " + employee.getId());

    }

    public void deleteEmployee(int id)
            throws EmployeeNotFoundException {

        Employee employee = getEmployee(id);

        if (employee == null) {

            throw new EmployeeNotFoundException(
                    "Employee not found with id " + id);

        }

        employeeList.remove(employee);

    }

}