package org.example.exercise4;

import jakarta.persistence.*;

@Entity
public class Exercise4User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Exercise4User() {
    }

    public Exercise4User(String name) {
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