package com.wodotcode.petclinicapp.repository;


import com.wodotcode.petclinicapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
