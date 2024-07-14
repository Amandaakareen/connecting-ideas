package com.example.post.application.usecases;

import com.example.post.domain.repository.IUserRepository;
import com.example.post.interfaces.dtos.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase  {

    @Autowired
    private IUserRepository iUserRepository;

    public void create(UserDTO user) {
        iUserRepository.save(user);
    }
}
