package com.example.post.interfaces.controllers;

import com.example.post.application.usecases.CreateUserUseCase;
import com.example.post.interfaces.dtos.UserDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CreateUserUseCase createUserUseCase;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid UserDTO user){
        createUserUseCase.create(user);
        return null;
    }
}
