package com.example.spring_sample.trySpring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {

    private int employeeId;
    private String employeeName;
    private int age;
}
