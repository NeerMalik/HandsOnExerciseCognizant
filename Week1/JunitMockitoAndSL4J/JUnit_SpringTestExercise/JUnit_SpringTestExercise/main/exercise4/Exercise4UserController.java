package org.example.exercise4;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exercise4/users")
public class Exercise4UserController {

    private final Exercise4UserService service;

    public Exercise4UserController(
            Exercise4UserService service) {

        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise4User> getUser(
            @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                service.getUser(id)
        );
    }
}