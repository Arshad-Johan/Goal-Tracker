package com.sample.springboot_boilerplate.controller;

import com.sample.springboot_boilerplate.dto.GoalDTO;
import com.sample.springboot_boilerplate.service.GoalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sample.springboot_boilerplate.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/goal")
@CrossOrigin(origins = "http://localhost:5173")
public class GoalController {

    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<GoalDTO>> getAllGoals() {
        
        List<GoalDTO> goals = goalService.getAllGoals();
        return ResponseEntity.ok(goals);
    }



    @GetMapping("/list/{id}")
    public ResponseEntity<?> getGoalById(@PathVariable Integer id) {
        try {
            GoalDTO organization = goalService.getGoalById(id);
            return ResponseEntity.ok(organization);
        } catch (ResourceNotFoundException ex) {
            // Send a default 404 Not Found response
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}