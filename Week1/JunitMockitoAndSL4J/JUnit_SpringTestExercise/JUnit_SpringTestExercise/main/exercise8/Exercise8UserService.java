package org.example.exercise8;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class Exercise8UserService {

    public String getUser(Long id) {
        throw new NoSuchElementException(
                "User not found");
    }
}