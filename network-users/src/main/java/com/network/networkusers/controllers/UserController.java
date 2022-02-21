package com.network.networkusers.controllers;

import com.network.networkusers.data.model.User;
import com.network.networkusers.data.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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

    // TODO: temporary solution - need oAuth
    @PostMapping("/auth")
    public ResponseEntity<String> authUser(@RequestBody AuthUserPayLoad authUserPayLoad) {
        return ResponseEntity.ok(userService.authUser(authUserPayLoad.email, authUserPayLoad.password));
    }

    // TODO: temporary solution - need oAuth
    private static class AuthUserPayLoad {
        private String email;
        private String password;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
