package com.cognizant.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import com.cognizant.employeemanagementsystem.projection.EmployeeView;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // =========================
    // Derived Query Methods
    // =========================

    Employee findByEmail(String email);

    List<Employee> findByName(String name);

    List<Employee> findByNameContaining(String keyword);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findByDepartmentName(String departmentName);

    List<Employee> findByNameIgnoreCase(String name);

    List<Employee> findByEmailContaining(String text);

    long countByDepartmentName(String departmentName);

    boolean existsByEmail(String email);

    // =========================
    // JPQL Queries
    // =========================

    @Query("SELECT e FROM Employee e")
    List<Employee> getAllEmployees();

    @Query("SELECT e FROM Employee e WHERE e.email = ?1")
    Employee getEmployeeByEmail(String email);

    @Query("SELECT e FROM Employee e WHERE e.name LIKE %?1%")
    List<Employee> searchEmployee(String keyword);

    @Query("SELECT e FROM Employee e WHERE e.department.name = ?1")
    List<Employee> getEmployeesByDepartment(String department);

    // =========================
    // Native Query
    // =========================

    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> getAllEmployeesNative();

    // =========================
    // Interface Projection
    // =========================

    List<EmployeeView> findProjectedBy();

    // =========================
    // Class Projection (DTO)
    // =========================

    @Query("SELECT new com.cognizant.employeemanagementsystem.projection.EmployeeDTO(e.name, e.email) FROM Employee e")
    List<EmployeeDTO> getEmployeeDTO();

    // =========================
    // Pagination
    // =========================

    Page<Employee> findAll(Pageable pageable);

}