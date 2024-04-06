package com.jetbrains.cristi.notite.criptate.controller;

import com.jetbrains.cristi.notite.criptate.model.User;
import com.jetbrains.cristi.notite.criptate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUsers(){return userService.getAllUsers();}
    @GetMapping("/id")
    public User getUserById(@PathVariable Long id) { return userService.getUserById(id);}
    @PostMapping("/add")
    public User createUser(@RequestBody User user) {return userService.createUser(user);}
    @PutMapping("/update")
    public User updateUser(@PathVariable Long id, String email, @RequestBody User user) {return userService.updateUser(id, email, user);}

    public void deleteUser(@PathVariable Long id){userService.deleteUser(id);}
}
