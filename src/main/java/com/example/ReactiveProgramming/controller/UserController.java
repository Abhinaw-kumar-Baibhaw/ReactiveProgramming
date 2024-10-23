package com.example.ReactiveProgramming.controller;

import com.example.ReactiveProgramming.model.User1;
import com.example.ReactiveProgramming.service.UserService;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Optional;



@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Flux<User1> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User1> getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User1 createUser(@RequestBody User1 user) {
        return userService.save(user);
    }


}

