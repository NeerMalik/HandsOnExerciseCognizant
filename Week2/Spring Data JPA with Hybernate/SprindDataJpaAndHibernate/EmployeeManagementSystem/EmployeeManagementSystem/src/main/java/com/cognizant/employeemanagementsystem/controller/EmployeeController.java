package com.cognizant.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import com.cognizant.employeemanagementsystem.projection.EmployeeView;
import com.cognizant.employeemanagementsystem.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create Employee
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get Employee By ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // Get Employee By Email
    @GetMapping("/email/{email}")
    public Employee getEmployeeByEmail(@PathVariable String email) {
        return employeeService.getEmployeeByEmail(email);
    }

    // Get Employee By Name
    @GetMapping("/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name) {
        return employeeService.getEmployeeByName(name);
    }

    // Search Employee
    @GetMapping("/search/{keyword}")
    public List<Employee> searchEmployee(@PathVariable String keyword) {
        return employeeService.searchEmployee(keyword);
    }

    // Get Employees By Department
    @GetMapping("/department/{department}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String department) {
        return employeeService.getEmployeesByDepartment(department);
    }

    // Check Email Exists
    @GetMapping("/exists/{email}")
    public boolean exists(@PathVariable String email) {
        return employeeService.existsByEmail(email);
    }

    // Count Employees
    @GetMapping("/count/{department}")
    public long count(@PathVariable String department) {
        return employeeService.countByDepartment(department);
    }

    // Native Query
    @GetMapping("/native")
    public List<Employee> nativeQuery() {
        return employeeService.getAllEmployeesNative();
    }

    // Pagination
    @GetMapping("/page")
    public Page<Employee> pagination(@RequestParam int page,
                                     @RequestParam int size) {

        return employeeService.getEmployeesByPage(page, size);
    }

    // Sorting
    @GetMapping("/sort")
    public List<Employee> sorting(@RequestParam String field) {

        return employeeService.sortEmployees(field);
    }

    // Pagination + Sorting
    @GetMapping("/pageSort")
    public Page<Employee> pageSorting(@RequestParam int page,
                                      @RequestParam int size,
                                      @RequestParam String field) {

        return employeeService.getEmployeesByPageAndSort(page, size, field);
    }

    // Interface Projection
    @GetMapping("/projection")
    public List<EmployeeView> projection() {

        return employeeService.getEmployeeProjection();
    }

    // DTO Projection
    @GetMapping("/dto")
    public List<EmployeeDTO> dto() {

        return employeeService.getEmployeeDTO();
    }

    // Update Employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,
                                   @RequestBody Employee employee) {

        return employeeService.updateEmployee(id, employee);
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        return employeeService.deleteEmployee(id);
    }

}