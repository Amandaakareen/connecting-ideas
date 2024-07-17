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
    public Boolean findByName(String name) {
        Optional<User> user = userRepository.findByName(name);
        return user.isPresent();
    }

    @Override
    public Boolean findByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.isPresent();
    }
}
