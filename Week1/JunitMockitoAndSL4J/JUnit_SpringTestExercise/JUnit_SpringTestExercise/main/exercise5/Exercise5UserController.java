package org.example.exercise5;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exercise5/users")
public class Exercise5UserController {

    private final Exercise5UserService userService;

    public Exercise5UserController(
            Exercise5UserService userService) {

        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Exercise5User> createUser(
            @RequestBody Exercise5User user) {

        return ResponseEntity.ok(
                userService.saveUser(user));
    }
}