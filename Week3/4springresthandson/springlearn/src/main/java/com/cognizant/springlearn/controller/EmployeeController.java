package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();

    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {

        return employeeService.getEmployee(id);

    }

    @PutMapping
    public void updateEmployee(
            @RequestBody @Valid Employee employee)
            throws EmployeeNotFoundException {

        employeeService.updateEmployee(employee);

    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(
            @PathVariable int id)
            throws EmployeeNotFoundException {

        employeeService.deleteEmployee(id);

    }

}