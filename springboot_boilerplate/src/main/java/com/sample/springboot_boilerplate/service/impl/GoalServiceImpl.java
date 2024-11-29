package com.sample.springboot_boilerplate.service.impl;

import com.sample.springboot_boilerplate.dto.GoalDTO;
import com.sample.springboot_boilerplate.exception.ResourceNotFoundException;
import com.sample.springboot_boilerplate.mapper.GoalMapper;
import com.sample.springboot_boilerplate.repository.GoalRepository;
import com.sample.springboot_boilerplate.service.GoalService;
import org.springframework.stereotype.Service;
import com.sample.springboot_boilerplate.entity.Goal;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoalServiceImpl implements GoalService {

    private final GoalRepository goalRepository;
    private final GoalMapper goalMapper;

    public GoalServiceImpl(GoalRepository goalRepository, GoalMapper goalMapper) {
        this.goalRepository = goalRepository;
        this.goalMapper = goalMapper;
    }

    @Override
    public List<GoalDTO> getAllGoals() {
        List<Goal> organizations = goalRepository.findAll();
        return organizations.stream()
                .map(goalMapper::toDTO)
                .collect(Collectors.toList());
    }
    
    @Override
    public GoalDTO getGoalById(Integer id) {
        Goal organization = goalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Goal not found with ID: " + id));

        return goalMapper.toDTO(organization);
    }
}