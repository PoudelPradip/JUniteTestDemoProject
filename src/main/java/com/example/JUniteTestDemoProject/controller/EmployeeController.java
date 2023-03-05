package com.example.JUniteTestDemoProject.controller;


import com.example.JUniteTestDemoProject.model.EmployeeModel;
import com.example.JUniteTestDemoProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/test")
    public String test(){
        return "test method executed";
    }
    @PostMapping("/save")
    public String saveEmployee(@RequestBody EmployeeModel employeeModel){
        this.employeeService.saveData(employeeModel);
        return "save sucess";
    }
}
