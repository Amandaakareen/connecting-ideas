package com.example.post.domain.repository;


import com.example.post.interfaces.dtos.UserDTO;

public interface IUserRepository {
    void save(UserDTO user);
}
