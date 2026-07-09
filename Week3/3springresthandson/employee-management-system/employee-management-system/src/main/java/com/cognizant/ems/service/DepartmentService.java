package com.cognizant.ems.service;

import com.cognizant.ems.dao.DepartmentDao;
import com.cognizant.ems.model.Department;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Transactional
    public ArrayList<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }

}