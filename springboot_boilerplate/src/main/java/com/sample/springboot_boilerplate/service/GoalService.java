package com.sample.springboot_boilerplate.service;
import com.sample.springboot_boilerplate.dto.GoalDTO;
import java.util.List;

public interface GoalService {
    List<GoalDTO> getAllGoals();
    GoalDTO getGoalById(Integer id);
}

