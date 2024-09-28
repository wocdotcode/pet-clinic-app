package com.wodotcode.petclinicapp.factory;

import com.wodotcode.petclinicapp.model.Admin;
import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.repository.AdminRepository;
import com.wodotcode.petclinicapp.request.RegistrationRequest;
import com.wodotcode.petclinicapp.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AdminFactory {

    private final AdminRepository adminRepository;
    private final UserAttributesMapper userAttributesMapper;


    public Admin createAdmin(RegistrationRequest request) {

        Admin admin = new Admin();

        userAttributesMapper.setCommonAttributes(request, admin);

        return adminRepository.save(admin);

    }
}
