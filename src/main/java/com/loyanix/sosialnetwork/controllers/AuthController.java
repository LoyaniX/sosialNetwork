package com.loyanix.sosialnetwork.controllers;

import com.loyanix.sosialnetwork.exceptions.AccessDeniedException;
import com.loyanix.sosialnetwork.models.User;
import com.loyanix.sosialnetwork.requests.LoginUserRequest;
import com.loyanix.sosialnetwork.requests.RegisterUserRequest;
import com.loyanix.sosialnetwork.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity registerUser(@RequestBody RegisterUserRequest user) {
        User savedUser = authService.registerUser(user);
        return ResponseEntity.status(200).body(savedUser);
    }

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody LoginUserRequest user) {
        User loginUser;
        try {
            loginUser = authService.loginUser(user);
        } catch (AccessDeniedException exception) {
            return ResponseEntity.status(400).body(exception.getMessage());
        }

        return ResponseEntity.status(200).body(loginUser);
    }
}
