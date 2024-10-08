package com.wodotcode.petclinicapp.exception;

public class UserAlreadyExistsException extends RuntimeException{


    public UserAlreadyExistsException(String message) {
        super(message);
    }

}
