package org.example.mock3;

public class Exercise3User {

    private Long id;
    private String name;

    public Exercise3User() {
    }

    public Exercise3User(Long id, String name) {
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