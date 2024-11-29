package com.sample.springboot_boilerplate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalDTO {
    private Integer gid;
    private String goal_title;
    private String goal_desc;
    private Integer assigned_to;
    private Integer created_by;
    private String goal_start_date;
    private String goal_end_date;
    private String goal_created_date;
    private String goal_updated_date;
    private String goal_type;
    private String goal_status;
    private Integer goal_priority;
    private String goal_ref;
}
