package com.vincent.gestiondestock.controller;


import com.vincent.gestiondestock.model.Users;
import com.vincent.gestiondestock.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
//Naming convention users in Rest
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    List<Users> findUser() {
        return userService.getAllUser();
    }
}
