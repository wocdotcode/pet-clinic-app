package com.wodotcode.petclinicapp.controller;

import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.service.UserService;
import org.springframework.web.bind.annotation.*;


import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {


    private final UserService userService;

    @PostMapping
    public void add(@RequestBody User user) {
        userService.add(user);
    }
}
