package com.wodotcode.petclinicapp.dto;


import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;

    private String phoneNumber;
    private String email;
    private String password;
    private String userType;
    private boolean isEnabled;


    private String specialization;
}
