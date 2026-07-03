package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.entity.Department;
import com.cognizant.employeemanagementsystem.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }


    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }


    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }


    public Department updateDepartment(Long id, Department department) {

        Department existingDepartment = departmentRepository.findById(id).orElse(null);

        if (existingDepartment != null) {

            existingDepartment.setName(department.getName());

            return departmentRepository.save(existingDepartment);
        }

        return null;
    }


    public String deleteDepartment(Long id) {

        departmentRepository.deleteById(id);

        return "Department Deleted Successfully";
    }

}