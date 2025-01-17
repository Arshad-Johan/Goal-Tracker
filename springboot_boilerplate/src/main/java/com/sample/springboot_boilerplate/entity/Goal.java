package com.sample.springboot_boilerplate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "goals")  // This should match your table name
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-incremented gid column
    @Column(name = "gid", nullable = false, updatable = false)
    private Integer gid;

    @Column(name = "goal_title", nullable = false, length = 25)
    private String goalTitle;

    @Column(name = "goal_desc", nullable = false, length = 255)
    private String goalDesc;

    @Column(name = "assigned_to", nullable = false)
    private Integer assignedTo;

    @Column(name = "created_by", nullable = false)
    private Integer createdBy;

    @Column(name = "goal_start_date", nullable = false)
    private LocalDate goalStartDate;

    @Column(name = "goal_end_date", nullable = false)
    private LocalDate goalEndDate;

    @Column(name = "goal_created_date", nullable = false)
    private LocalDate goalCreatedDate;

    @Column(name = "goal_updated_date", nullable = false)
    private LocalDate goalUpdatedDate;

    @Column(name = "goal_type", nullable = false, length = 255)
    private String goalType;

    @Column(name = "goal_status", nullable = false, length = 255)
    private String goalStatus;

    @Column(name = "goal_priority", nullable = false)
    private Integer goalPriority;

    @Column(name = "goal_ref", nullable = false, length = 255)
    private String goalRef;

    // Optionally, you can add other relationships, validations, etc.
}
