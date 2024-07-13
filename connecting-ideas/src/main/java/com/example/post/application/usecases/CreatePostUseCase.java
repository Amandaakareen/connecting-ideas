package com.example.post.application.usecases;

import com.example.post.application.usecases.interfaces.ICreatePostUseCase;
import com.example.post.interfaces.dtos.PostDTO;
import org.springframework.stereotype.Service;

@Service
public class CreatePostUseCase implements ICreatePostUseCase {
    @Override
    public void create(PostDTO post) {

    }
}
