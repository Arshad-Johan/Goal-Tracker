package com.sample.springboot_boilerplate.service.impl;

import com.sample.springboot_boilerplate.dto.UserDTO;
import com.sample.springboot_boilerplate.exception.ResourceNotFoundException;
import com.sample.springboot_boilerplate.mapper.UserMapper;
import com.sample.springboot_boilerplate.repository.UserRepository;
import com.sample.springboot_boilerplate.service.UserService;
import org.springframework.stereotype.Service;
import com.sample.springboot_boilerplate.entity.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> organizations = userRepository.findAll();
        return organizations.stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }
    
    @Override
    public UserDTO getUserById(Integer id) {
        User organization = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));

        return userMapper.toDTO(organization);
    }
}