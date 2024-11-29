package com.sample.springboot_boilerplate.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalDTO {
    private Integer gid;
    private String goalTitle;
    private String goalDesc;
    private Integer assignedTo;  // ID of the assigned user
    private Integer createdBy;   // ID of the user who created the goal
    private LocalDate goalStartDate;
    private LocalDate goalEndDate;
    private LocalDate goalCreatedDate;
    private LocalDate goalUpdatedDate;
    private String goalType;
    private String goalStatus;
    private Integer goalPriority;
    private String goalRef;
}
