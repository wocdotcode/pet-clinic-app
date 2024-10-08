package com.wodotcode.petclinicapp.controller;

import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.request.RegistrationRequest;
import com.wodotcode.petclinicapp.service.user.UserService;
import org.springframework.web.bind.annotation.*;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {


    private final UserService userService;

    @PostMapping
    public User add(@RequestBody RegistrationRequest request)
    {
      return  userService.add(request);
    }
}
