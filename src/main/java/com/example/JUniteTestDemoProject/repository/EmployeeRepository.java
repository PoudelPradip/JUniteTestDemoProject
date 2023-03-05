package com.example.JUniteTestDemoProject.repository;

import com.example.JUniteTestDemoProject.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
}
