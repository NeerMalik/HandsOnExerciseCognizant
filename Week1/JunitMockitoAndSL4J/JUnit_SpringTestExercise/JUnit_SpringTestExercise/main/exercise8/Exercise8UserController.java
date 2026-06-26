package org.example.exercise8;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exercise8/users")
public class Exercise8UserController {

    private final Exercise8UserService service;

    public Exercise8UserController(
            Exercise8UserService service) {

        this.service = service;
    }

    @GetMapping("/{id}")
    public String getUser(
            @PathVariable("id") Long id) {

        return service.getUser(id);
    }
}