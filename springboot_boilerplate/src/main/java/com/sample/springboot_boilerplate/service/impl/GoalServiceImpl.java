package com.sample.springboot_boilerplate.service.impl;

import jakarta.persistence.EntityManager;
import com.sample.springboot_boilerplate.Db.GoalHandler;
import com.sample.springboot_boilerplate.Db.GoalHandler.GoalRepository;
import com.sample.springboot_boilerplate.dto.GoalDTO;
import com.sample.springboot_boilerplate.exception.ResourceNotFoundException;
import com.sample.springboot_boilerplate.service.GoalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class GoalServiceImpl implements GoalService {
    private EntityManager entityManager;

    @Override
    public List<GoalDTO> getAllGoals() {
        List<Object[]> orgs = GoalRepository.getAllGoals(entityManager);
        List<GoalDTO> products = new ArrayList<>();

        for  (Object[] org : orgs) {
             GoalDTO dto = new GoalDTO();
             dto.setGid(Integer.parseInt(Objects.toString(org[0])));
             dto.setGoal_title((String) org[1]);
             dto.setGoal_desc((String) org[2]);
             dto.setAssigned_to(Integer.parseInt(Objects.toString(org[3])));
             dto.setCreated_by(Integer.parseInt(Objects.toString(org[4])));
             dto.setGoal_start_date((String) org[5]);
             dto.setGoal_end_date((String) org[6]);
             dto.setGoal_created_date((String) org[7]);
             dto.setGoal_updated_date((String) org[8]);
             dto.setGoal_type((String) org[9]);
             dto.setGoal_status((String) org[10]);
             dto.setGoal_priority(Integer.parseInt(Objects.toString(org[11])));
             dto.setGoal_ref((String) org[12]);

             products.add(dto);
        }

        return products;
    }


    @Override
    public List<GoalDTO> getGoalById(Integer id) {
        GoalHandler.setEntityManager(entityManager);
        GoalHandler goalHandler = new GoalHandler();
        List<Object[]> orgs = GoalHandler.getGoalById(id);
        List<GoalDTO> products = new ArrayList<>();
        for  (Object[] org : orgs) {
            GoalDTO dto = new GoalDTO();
            dto.setGid(Integer.parseInt(Objects.toString(org[0])));
            dto.setGoal_title((String) org[1]);
            dto.setGoal_desc((String) org[2]);
            dto.setAssigned_to(Integer.parseInt(Objects.toString(org[3])));
            dto.setCreated_by(Integer.parseInt(Objects.toString(org[4])));
            dto.setGoal_start_date((String) org[5]);
            dto.setGoal_end_date((String) org[6]);
            dto.setGoal_created_date((String) org[7]);
            dto.setGoal_updated_date((String) org[8]);
            dto.setGoal_type((String) org[9]);
            dto.setGoal_status((String) org[10]);
            dto.setGoal_priority(Integer.parseInt(Objects.toString(org[11])));
            dto.setGoal_ref((String) org[12]);
            products.add(dto);
        }

        return products;
    }

}