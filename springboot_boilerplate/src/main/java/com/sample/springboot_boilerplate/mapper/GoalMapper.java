package com.sample.springboot_boilerplate.mapper;

import com.sample.springboot_boilerplate.dto.GoalDTO;
import com.sample.springboot_boilerplate.entity.Goal;
import org.springframework.stereotype.Component;

@Component
public class GoalMapper {

    // Method to convert Goal entity to GoalDTO
    public GoalDTO toDTO(Goal goal) {
        if (goal == null) {
            return null;  // return null if Goal entity is null
        }
        return new GoalDTO(
                goal.getGid(),
                goal.getGoalTitle(),
                goal.getGoalDesc(),
                goal.getAssignedTo(),  // Assuming assignedTo is a String, convert it to Integer
                goal.getCreatedBy(),   // Assuming createdBy is a String, convert it to Integer
                goal.getGoalStartDate(),
                goal.getGoalEndDate(),
                goal.getGoalCreatedDate(),
                goal.getGoalUpdatedDate(),
                goal.getGoalType(),
                goal.getGoalStatus(),
                goal.getGoalPriority(),
                goal.getGoalRef()
        );
    }
}
