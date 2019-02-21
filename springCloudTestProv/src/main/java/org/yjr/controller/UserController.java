package org.yjr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.yjr.entity.User;
import org.yjr.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/Users")
    public List<User> findAll(){
        return userService.findAll();
    }
    
    @GetMapping("/User/{id}")
    public User findById(@PathVariable(name="id") long id) {
        return userService.findById(id);
    }
}
