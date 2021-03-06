package com.vincent.gestiondestock.controller;


import com.vincent.gestiondestock.model.User;
import com.vincent.gestiondestock.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
//Naming convention users in Rest

public class UserController {
    private final UserService userService;

    @GetMapping("/home")
    List<User> findUser() {
        return userService.getAllUser();
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

}
