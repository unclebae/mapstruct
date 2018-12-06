package com.example.mapstruct.demomapstruct.entity.employee;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EmployeeDTO {
    private Long employeeId;
    private String employeeName;
    private String employeeType;
    private String employeeTypeCode;
    private String joinedAt;
}
