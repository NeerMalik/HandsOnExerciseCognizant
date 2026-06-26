package org.example;

import org.springframework.stereotype.Service;

@Service
public class Exercise3UserService {

    public Exercise3User getUserById(Long id) {
        return new Exercise3User(id, "John");
    }
}