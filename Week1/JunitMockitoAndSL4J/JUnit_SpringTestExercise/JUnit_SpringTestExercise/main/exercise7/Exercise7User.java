package org.example.exercise7;

import jakarta.persistence.*;

@Entity
public class Exercise7User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Exercise7User() {
    }

    public Exercise7User(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}