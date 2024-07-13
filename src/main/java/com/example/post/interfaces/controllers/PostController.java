package com.example.post.interfaces.controllers;


import com.example.post.application.usecases.interfaces.ICreatePostUseCase;
import com.example.post.interfaces.dtos.PostDTO;
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
    private ICreatePostUseCase iCreatePostUseCase;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid PostDTO post){
        iCreatePostUseCase.create(post);
        return null;
    }
}