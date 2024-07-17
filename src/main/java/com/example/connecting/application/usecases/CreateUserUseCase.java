package com.example.connecting.application.usecases;

import com.example.connecting.domain.repository.IUserRepository;
import com.example.connecting.interfaces.dtos.UserDTO;
import com.example.connecting.util.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase  {

    @Autowired
    private IUserRepository iUserRepository;

    public void create(UserDTO userDTO) {
        Boolean nameIsExist = iUserRepository.findByName(userDTO.name());
        if(nameIsExist) {
            throw new RuntimeException("esse nome já existe");
        }
        Boolean emailIsExist = iUserRepository.findByEmail(userDTO.email());
        if(emailIsExist) {
            throw new RuntimeException("esse email já existe");
        }
        PasswordValidator.validatePassword(userDTO.password());
        iUserRepository.save(userDTO);
    }

}
