package org.example.exercise6;

public class Exercise6User {

    private Long id;
    private String name;

    public Exercise6User() {
    }

    public Exercise6User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}