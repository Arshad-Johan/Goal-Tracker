package com.sample.springboot_boilerplate.controller;

import com.sample.springboot_boilerplate.dto.GoalDTO;
import com.sample.springboot_boilerplate.service.GoalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goal")
@CrossOrigin(origins = "http://localhost:5174")
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
    public ResponseEntity<?> getGoalById(@PathVariable("id") Integer id) {
        List<GoalDTO> goal  = goalService.getGoalById(id);
        return ResponseEntity.ok(goal);
    }
}
