package com.wodotcode.petclinicapp.factory;

import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.request.RegistrationRequest;

public interface UserFactory {

    public User createUser(RegistrationRequest registrationRequest);
}
