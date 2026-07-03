package com.cognizant.employeemanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "employee")

@DynamicInsert
@DynamicUpdate

@NamedQueries({

        @NamedQuery(
                name = "Employee.findByEmail",
                query = "SELECT e FROM Employee e WHERE e.email=?1"
        ),

        @NamedQuery(
                name = "Employee.findByName",
                query = "SELECT e FROM Employee e WHERE e.name=?1"
        )

})

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    @JsonBackReference
    private Department department;

}