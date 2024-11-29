package com.sample.springboot_boilerplate.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Integer id;           // Primary key, auto-incremented
    private String userName;      // User's name
    private String rollno;        // Roll number, unique
    private String mailId;        // Email ID, unique
    private String pass;          // Password
    private String userStatus;    // User's status
    private LocalDate createdDate; // Date of creation
    private String userRole;      // Role of the user
}
