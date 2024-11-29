package com.sample.springboot_boilerplate.service;
import com.sample.springboot_boilerplate.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Integer id);
}

