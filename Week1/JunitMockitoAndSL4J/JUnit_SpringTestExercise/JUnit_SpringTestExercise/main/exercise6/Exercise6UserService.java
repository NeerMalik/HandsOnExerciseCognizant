package org.example.exercise6;

import java.util.NoSuchElementException;

public class Exercise6UserService {

    private final Exercise6UserRepository repository;

    public Exercise6UserService(
            Exercise6UserRepository repository) {

        this.repository = repository;
    }

    public Exercise6User getUserById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new NoSuchElementException(
                                "User not found"));
    }
}