package com.ajiii.muslimCommunityApp.controller;

import com.ajiii.muslimCommunityApp.model.User;
import com.ajiii.muslimCommunityApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("signup")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


}
