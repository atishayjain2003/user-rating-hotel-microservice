package com.example.UserService.controllers;

import com.example.UserService.entitites.User;
import com.example.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //controller to get all users
    @GetMapping("/all-Users")
    public ResponseEntity<String> getAllUsers()
    {

            List<User> allUsers = userService.getAllUsers();
            return ResponseEntity.ok(allUsers.toString());
    }

    //controller to get user by id
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId)
    {
        User foundUser= userService.getUserById(userId);
        return ResponseEntity.ok(foundUser);
    }

    //controller to create user

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User createdUser= userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

}
