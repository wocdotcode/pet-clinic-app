package com.wodotcode.petclinicapp.service.user;


import com.wodotcode.petclinicapp.factory.UserFactory;
import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.repository.UserRepository;
import com.wodotcode.petclinicapp.request.RegistrationRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserFactory userFactory;


    public User add(RegistrationRequest request) {
        return userFactory.createUser(request);

    }
}
