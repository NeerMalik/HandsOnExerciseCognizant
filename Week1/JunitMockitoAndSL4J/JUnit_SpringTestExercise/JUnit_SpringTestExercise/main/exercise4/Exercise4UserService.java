package org.example.exercise4;

import org.springframework.stereotype.Service;

@Service
public class Exercise4UserService {

    private final Exercise4UserRepository repository;

    public Exercise4UserService(
            Exercise4UserRepository repository) {

        this.repository = repository;
    }

    public Exercise4User getUser(Long id) {
        return repository.findById(id).orElse(null);
    }
}