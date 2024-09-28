package com.wodotcode.petclinicapp.factory;

import com.wodotcode.petclinicapp.exception.UserAlreadyExistsException;
import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.repository.AdminRepository;
import com.wodotcode.petclinicapp.repository.PatientRepository;
import com.wodotcode.petclinicapp.repository.UserRepository;
import com.wodotcode.petclinicapp.repository.VeterinarianRepository;
import com.wodotcode.petclinicapp.request.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SimpleUserFactory implements UserFactory{
    private final UserRepository userRepository;
    private final PatientFactory patientFactory;
    private final VeterinarianFactory veterinarianFactory;
    private final AdminFactory adminFactory;

    @Override
    public User createUser(RegistrationRequest registrationRequest) {
       if(userRepository.existsByEmail(registrationRequest.getEmail())) {
           throw new UserAlreadyExistsException("Sorry + " + registrationRequest.getEmail() + " allready exists");

       }
       switch (registrationRequest.getUserType()) {
           case "VET" -> {return veterinarianFactory.createVeterinarian(registrationRequest);
           }
           case "PATIENT" -> {return patientFactory.createPatient(registrationRequest);
           }
           case "ADMIN" -> {return adminFactory.createAdmin(registrationRequest);
           }
           default -> {
               return null;
           }
       }

    }
}
