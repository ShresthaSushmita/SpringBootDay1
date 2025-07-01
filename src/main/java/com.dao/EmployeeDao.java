package com.dao;

import com.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<EmployeeEntity,Integer> {
    Optional<EmployeeEntity> findByEmailIdAndPassword(String emailId, String password);

    List<EmployeeEntity> findAll();
}
