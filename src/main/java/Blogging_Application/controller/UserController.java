package Blogging_Application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Blogging_Application.entities.User;
import Blogging_Application.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return service.createUser(user);
    }

    @GetMapping("/")
    public List<User> getUsers(){
        return service.getAllUsers();
    }
}


