package com.sample.springboot_boilerplate.repository;

import com.sample.springboot_boilerplate.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GoalRepository extends JpaRepository<Goal, Integer> {
    
}
