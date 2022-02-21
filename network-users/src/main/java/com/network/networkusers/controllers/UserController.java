package com.network.networkusers.controllers;

import com.network.networkusers.data.model.User;
import com.network.networkusers.data.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author SIE
 */
@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id) {
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping
    public ResponseEntity<Void> registerUser(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.ok().build();
    }
}
