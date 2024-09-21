package com.wodotcode.petclinicapp.repository;

import com.wodotcode.petclinicapp.model.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarianRepository extends JpaRepository<Veterinarian, Long> {
}
