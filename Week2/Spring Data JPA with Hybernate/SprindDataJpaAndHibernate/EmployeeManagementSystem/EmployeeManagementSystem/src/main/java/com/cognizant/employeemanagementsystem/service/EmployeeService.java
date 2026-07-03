package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import com.cognizant.employeemanagementsystem.projection.EmployeeView;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> searchEmployee(String keyword) {
        return employeeRepository.findByNameContaining(keyword);
    }

    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartmentName(department);
    }

    public boolean existsByEmail(String email) {
        return employeeRepository.existsByEmail(email);
    }

    public long countByDepartment(String department) {
        return employeeRepository.countByDepartmentName(department);
    }

    public List<Employee> getAllEmployeesNative() {
        return employeeRepository.getAllEmployeesNative();
    }

    public Page<Employee> getEmployeesByPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return employeeRepository.findAll(pageable);
    }

    public List<Employee> sortEmployees(String field) {
        return employeeRepository.findAll(Sort.by(field));
    }

    public Page<Employee> getEmployeesByPageAndSort(int page, int size, String field) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(field));
        return employeeRepository.findAll(pageable);
    }

    public List<EmployeeView> getEmployeeProjection() {
        return employeeRepository.findProjectedBy();
    }

    public List<EmployeeDTO> getEmployeeDTO() {
        return employeeRepository.getEmployeeDTO();
    }

    public Employee updateEmployee(Long id, Employee employee) {

        Employee existingEmployee = employeeRepository.findById(id).orElse(null);

        if (existingEmployee != null) {

            existingEmployee.setName(employee.getName());
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setDepartment(employee.getDepartment());

            return employeeRepository.save(existingEmployee);

        }

        return null;
    }

    public String deleteEmployee(Long id) {

        employeeRepository.deleteById(id);

        return "Employee Deleted Successfully";

    }

}