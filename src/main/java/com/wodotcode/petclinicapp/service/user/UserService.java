package com.wodotcode.petclinicapp.service.user;


import com.wodotcode.petclinicapp.model.User;
import com.wodotcode.petclinicapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void add(User user) {
        userRepository.save(user);

    }
}
