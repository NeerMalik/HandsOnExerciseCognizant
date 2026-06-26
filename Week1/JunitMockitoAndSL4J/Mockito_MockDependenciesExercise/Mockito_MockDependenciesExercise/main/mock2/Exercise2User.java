package org.example.mock2;

public class Exercise2User {

    private Long id;
    private String name;

    public Exercise2User() {
    }

    public Exercise2User(Long id, String name) {
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