package com.sample.springboot_boilerplate.Db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GoalHandler {

    @PersistenceContext
    private static EntityManager entityManager;
    public static void setEntityManager(EntityManager em) {
        entityManager = em;
    }
    public class GoalRepository {

        @SuppressWarnings("unchecked")
        public static List<Object[]> getAllGoals(EntityManager em) {
            StringBuilder query = new StringBuilder();
            query.append("select * from goals ");
    
            Query nativeQuery = em.createNativeQuery(query.toString());
            return nativeQuery.getResultList();
        }
    }
    @SuppressWarnings("unchecked")
    public List<Object[]> getGoalById(Integer id) {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM goals WHERE gid = :id");

        Query nativeQuery = entityManager.createNativeQuery(query.toString());
        nativeQuery.setParameter("id", id);  // Set the parameter
        return nativeQuery.getResultList();   // Return the results
    }
}
