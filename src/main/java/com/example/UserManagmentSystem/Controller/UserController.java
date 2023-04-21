package com.example.UserManagmentSystem.Controller;

import com.example.UserManagmentSystem.Model.User;
import com.example.UserManagmentSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);


    }
    @GetMapping("/find-all")
    public List<User> finadAll() {
        return userService.findAll();

    }

    @GetMapping("/findById/{Id}")
    public User findById(@PathVariable int Id) {
        return userService.findById(Id);

    }

    @DeleteMapping("/DeleteById/{Id}")
    public String DeleteById(@PathVariable int Id) {
        return userService.DeleteById(Id);

    }

    @PutMapping("/UpdateById/{Id}/{name}")
    public User UpdateById(@PathVariable int Id, @PathVariable String name) {
        return userService.UpdateById(Id,name);

    }




}
