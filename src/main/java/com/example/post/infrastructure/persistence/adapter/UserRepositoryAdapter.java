package com.example.post.infrastructure.persistence.adapter;

import com.example.post.domain.models.User;
import com.example.post.domain.repository.IUserRepository;
import com.example.post.infrastructure.persistence.UserRepository;
import com.example.post.interfaces.dtos.UserDTO;
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
}
