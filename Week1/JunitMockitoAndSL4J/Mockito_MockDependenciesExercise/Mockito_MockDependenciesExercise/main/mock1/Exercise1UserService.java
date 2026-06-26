package org.example.mock1;

import org.springframework.stereotype.Service;

@Service
public class Exercise1UserService {

    public Exercise1User getUserById(Long id) {
        return new Exercise1User(id, "John");
    }
}