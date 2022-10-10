package com.loyanix.sosialnetwork.controllers;

import com.loyanix.sosialnetwork.models.User;
import com.loyanix.sosialnetwork.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    /*@PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable Long id, @RequestBody User user) {
        User currentUser = userService.updateUser(id, user);
        return ResponseEntity.ok(currentUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id, @RequestBody User user) {
        User currentUser = userService.updateUser(id, user);
        return ResponseEntity.ok(currentUser);
    }

    @PostMapping("/{id}")
    public ResponseEntity followUser(@PathVariable Long id, @RequestBody User user) {
        User currentUser = userService.updateUser(id, user);
        return ResponseEntity.ok(currentUser);
    }

    @PostMapping("/{id}")
    public ResponseEntity unFollowUser(@PathVariable Long id, @RequestBody User user) {
        User currentUser = userService.updateUser(id, user);
        return ResponseEntity.ok(currentUser);
    }*/
}
