package com.wodotcode.petclinicapp.repository;

import com.wodotcode.petclinicapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
