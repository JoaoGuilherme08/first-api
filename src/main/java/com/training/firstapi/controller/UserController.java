package com.training.firstapi.controller;

import com.training.firstapi.service.UserService;
import com.training.firstapi.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<User> getUsers(){
        return service.getUsers();
    }

    @PostMapping
    public User postUser(@RequestBody User user){
        return service.postUser(user);
    }
}
