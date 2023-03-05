package com.example.JUniteTestDemoProject.service;

import com.example.JUniteTestDemoProject.entity.EmployeeEntity;
import com.example.JUniteTestDemoProject.model.EmployeeModel;
import com.example.JUniteTestDemoProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String saveData(EmployeeModel employeeModel) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmpName(employeeModel.getName());
        employeeEntity.setAddress(employeeModel.getAddress());
        employeeEntity.setPhoneNo(employeeModel.getPhoneNo());
        try {
            employeeRepository.save(employeeEntity);
        } catch (Exception e) {
            System.out.println("print error details" + e.getMessage());
        }
        return "data save successfully";
    }
}