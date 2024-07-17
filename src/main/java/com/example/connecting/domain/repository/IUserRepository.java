package com.example.connecting.domain.repository;


import com.example.connecting.interfaces.dtos.UserDTO;

public interface IUserRepository {
    void save(UserDTO user);

    Boolean findByName(String name);

    Boolean findByEmail(String email);
}
