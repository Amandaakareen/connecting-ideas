package com.example.connecting.infrastructure.persistence.adapter;

import com.example.connecting.domain.models.User;
import com.example.connecting.domain.repository.IUserRepository;
import com.example.connecting.infrastructure.persistence.UserRepository;
import com.example.connecting.interfaces.dtos.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRepositoryAdapter implements IUserRepository {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(UserDTO userDTO) {
        User user = User.builder()
                .name(userDTO.name())
                .email(userDTO.email())
                .password(userDTO.password())
                .build();
        userRepository.save(user);
    }

    @Override
    public void existByName(String name) {
        Optional<User> user = userRepository.findByName(name);
        if( user.isPresent()) {
            throw new RuntimeException("esse nome já existe");
        }
    }

    @Override
    public void existByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isPresent()) {
            throw new RuntimeException("esse email já existe");
        }
    }
}
