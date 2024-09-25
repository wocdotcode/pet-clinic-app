package com.wodotcode.petclinicapp.repository;

import com.wodotcode.petclinicapp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
