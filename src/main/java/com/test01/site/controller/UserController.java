package com.test01.site.controller;

import com.test01.site.Model.User;
import com.test01.site.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @GetMapping
    public List<User> user() {
        return userRepository.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

}
