package com.network.networkusers.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SIE
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/sayHello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello, Hell!");
    }
}
