package com.example.post.application.usecases.interfaces;

import com.example.post.interfaces.dtos.PostDTO;

public interface ICreatePostUseCase {
    void create(PostDTO post);
}
