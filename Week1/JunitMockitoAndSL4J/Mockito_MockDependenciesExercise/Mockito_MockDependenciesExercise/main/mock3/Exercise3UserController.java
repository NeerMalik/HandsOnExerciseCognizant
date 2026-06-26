package org.example.mock3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mock3/users")
public class Exercise3UserController {

    private final Exercise3UserService service;

    public Exercise3UserController(
            Exercise3UserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise3User> getUser(
            @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                service.getUserById(id)
        );
    }
}