package org.example.mock1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mock1/users")
public class Exercise1UserController {

    private final Exercise1UserService userService;

    public Exercise1UserController(
            Exercise1UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise1User> getUser(
            @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                userService.getUserById(id)
        );
    }
}