package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exercise3/users")
public class Exercise3UserController {

    private final Exercise3UserService userService;

    public Exercise3UserController(Exercise3UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise3User> getUser(
            @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                userService.getUserById(id)
        );
    }
}