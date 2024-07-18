package com.example.connecting.domain.repository;


import com.example.connecting.interfaces.dtos.UserDTO;

public interface IUserRepository {
    void save(UserDTO user);

    void existByName(String name);

    void existByEmail(String email);
}
