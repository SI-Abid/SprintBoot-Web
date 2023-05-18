package com.example.mission_failed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mission_failed.model.Employee;
import com.example.mission_failed.repository.EmployeeRepository;

import org.springframework.ui.Model;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    // creating a method hanler to display list of employees

    @GetMapping("/")
    public String index() {
        return "welcome";
    }

    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "index";
    }
}