package com.example.invoicemanager.controllers;

import com.example.invoicemanager.models.User;
import com.example.invoicemanager.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/users")
@Validated
@AllArgsConstructor

public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable(name = "id") Long id) {
        return userService.getUser(id);
    }

    //feature 1, should be called by user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
