package com.example.JUniteTestDemoProject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column(name = "Emp_name")
    private String empName;

    @Column(name = "Address")
    private String address;

    @Column(name = "phoneNo")
    private String phoneNo;

}
