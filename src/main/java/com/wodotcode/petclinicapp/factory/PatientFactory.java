package com.wodotcode.petclinicapp.factory;

import com.wodotcode.petclinicapp.model.Patient;
import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.repository.PatientRepository;
import com.wodotcode.petclinicapp.request.RegistrationRequest;
import com.wodotcode.petclinicapp.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PatientFactory {

    private final PatientRepository patientRepository;
    private final UserAttributesMapper userAttributesMapper;

    public Patient createPatient(RegistrationRequest request) {

        Patient patient = new Patient();
        userAttributesMapper.setCommonAttributes(request, patient);
        return patientRepository.save(patient);
    }
}
