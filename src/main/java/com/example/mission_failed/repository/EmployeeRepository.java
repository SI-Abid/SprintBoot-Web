package com.example.mission_failed.repository;

import com.example.mission_failed.model.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAll();
}
