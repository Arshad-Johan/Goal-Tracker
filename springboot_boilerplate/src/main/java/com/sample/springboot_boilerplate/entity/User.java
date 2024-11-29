package com.sample.springboot_boilerplate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users") // Matches the name of the table in the database
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented primary key
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "user_name", nullable = false, length = 255)
    private String userName; // Corresponds to user_name in the table

    @Column(name = "rollno", nullable = false, unique = true, length = 10)
    private String rollno; // Unique roll number

    @Column(name = "mail_id", nullable = false, unique = true, length = 255)
    private String mailId; // Unique email ID

    @Column(name = "pass", nullable = false, length = 255)
    private String pass; // Password

    @Column(name = "user_status", nullable = false, length = 25)
    private String userStatus; // User status

    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate; // Date of creation

    @Column(name = "user_role", nullable = false, length = 255)
    private String userRole; // Role of the user
}
