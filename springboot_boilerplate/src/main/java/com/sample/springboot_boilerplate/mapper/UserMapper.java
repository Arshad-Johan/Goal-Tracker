package com.sample.springboot_boilerplate.mapper;

import com.sample.springboot_boilerplate.dto.UserDTO;
import com.sample.springboot_boilerplate.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    // Method to convert User entity to UserDTO
    public UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getUserName(),
                user.getRollno(),
                user.getMailId(),
                user.getPass(),
                user.getUserStatus(),
                user.getCreatedDate(),
                user.getUserRole()
        );
    }
}
