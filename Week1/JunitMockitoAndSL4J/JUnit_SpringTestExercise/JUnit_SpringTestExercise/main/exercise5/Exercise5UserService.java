package org.example.exercise5;

import org.springframework.stereotype.Service;

@Service
public class Exercise5UserService {

    public Exercise5User saveUser(
            Exercise5User user) {

        return user;
    }
}