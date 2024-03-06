package com.dev.springboot.service.impl;

import com.dev.springboot.dto.UserDto;
import com.dev.springboot.entity.User;
import com.dev.springboot.repository.RoleRepository;
import com.dev.springboot.repository.UserRepository;
import com.dev.springboot.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    @Override
    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getFirstName() + " " + userDto.getLastName());
        user.setEmail(userDto.getEmail());

        // Encrypt the password using spring security
        user.setPassword(userDto.getPassword());

//        Role role = roleRepository.findByName()
    }
}
