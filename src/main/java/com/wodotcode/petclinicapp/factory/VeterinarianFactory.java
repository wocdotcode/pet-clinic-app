package com.wodotcode.petclinicapp.factory;

import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.model.Veterinarian;
import com.wodotcode.petclinicapp.repository.VeterinarianRepository;
import com.wodotcode.petclinicapp.request.RegistrationRequest;
import com.wodotcode.petclinicapp.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class VeterinarianFactory {

    private final VeterinarianRepository veterinarianRepository;
    private final UserAttributesMapper userAttributesMapper;


    public User createVeterinarian(RegistrationRequest request) {
        Veterinarian veterinarian = new Veterinarian();
        userAttributesMapper.setCommonAttributes(request, veterinarian);
        veterinarian.setSpecialization(request.getSpecialization());

        return veterinarianRepository.save(veterinarian);

     
    }
}
