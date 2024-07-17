package com.example.connecting.interfaces.controllers;


import com.example.connecting.application.usecases.CreatePostUseCase;
import com.example.connecting.interfaces.dtos.PostDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/post")
public class PostController {

    @Autowired
    private CreatePostUseCase createPostUseCase;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid PostDTO post){
        createPostUseCase.create(post);
        return null;
    }
}