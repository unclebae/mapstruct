package com.example.mapstruct.demomapstruct.entity.employee;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Employee {

    private Long id;
    private String name;
    private EmployeeType employeeType;
    private LocalDateTime joinedAt;
}
