package com.wodotcode.petclinicapp.factory;

import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.request.RegistrationRequest;

public class SimpleUserFactory implements UserFactory{
    @Override
    public User createUser(RegistrationRequest registrationRequest) {
        return null;
    }
}
