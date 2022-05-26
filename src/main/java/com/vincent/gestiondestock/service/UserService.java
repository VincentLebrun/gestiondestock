package com.vincent.gestiondestock.service;


import com.vincent.gestiondestock.model.Users;
import com.vincent.gestiondestock.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }

}
