package com.example.mapstruct.demomapstruct.mapper;

import com.example.mapstruct.demomapstruct.entity.employee.Employee;
import com.example.mapstruct.demomapstruct.entity.employee.EmployeeDTO;
import com.example.mapstruct.demomapstruct.entity.employee.EmployeeType;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class EmployeeMapperTest {

    EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

    @Test
    public void convertEmployeeToEmployeeDTO() {
        Employee employee = createEmployeeFixture();
        final EmployeeDTO employeeDTO = mapper.convertToEmployeeDTO(employee);

        assertEquals(employee.getId(), employeeDTO.getEmployeeId());
        assertEquals(employee.getEmployeeType().toString(), employeeDTO.getEmployeeTypeCode());
        assertEquals(employee.getEmployeeType().getTitle(), employeeDTO.getEmployeeType());
    }

    @Test
    public void convertEmployeeDTOToEmployee() {
        final EmployeeDTO employeeDTO = createEmployeeDTOFixture();
        final Employee employee = mapper.convertToEmployee(employeeDTO);

        assertEquals(employee.getId(), employeeDTO.getEmployeeId());
        assertEquals(employee.getEmployeeType().toString(), employeeDTO.getEmployeeTypeCode());
        assertEquals(employee.getEmployeeType().getTitle(), employeeDTO.getEmployeeType());
    }

    private Employee createEmployeeFixture() {

        return Employee.builder()
                .id(111L)
                .name("배기도")
                .employeeType(EmployeeType.DEVELOPER)
                .joinedAt(LocalDateTime.now())
                .build();
    }

    private EmployeeDTO createEmployeeDTOFixture() {

        return EmployeeDTO.builder()
                .employeeId(111L)
                .employeeName("감나라")
                .employeeTypeCode("DESIGNER")
                .employeeType("디자이너")
                .joinedAt("2018-12-01 13:01:01")
                .build();
    }
}
