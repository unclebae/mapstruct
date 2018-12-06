package com.example.mapstruct.demomapstruct.mapper;

import com.example.mapstruct.demomapstruct.entity.employee.Employee;
import com.example.mapstruct.demomapstruct.entity.employee.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Mappings({
            @Mapping(target = "id", source = "employeeDTO.employeeId"),
            @Mapping(target = "name", source = "employeeDTO.employeeName"),
            @Mapping(target = "employeeType", source = "employeeDTO.employeeTypeCode"),
            @Mapping(target = "joinedAt", source = "employeeDTO.joinedAt", dateFormat = "yyyy-MM-dd HH:mm:ss"),
    })
    Employee convertToEmployee(EmployeeDTO employeeDTO);

    @Mappings({
            @Mapping(target = "employeeId", source = "employee.id"),
            @Mapping(target = "employeeName", source = "employee.name"),
            @Mapping(target = "employeeTypeCode", source = "employee.employeeType"),
            @Mapping(target = "employeeType", source = "employee.employeeType.title"),
            @Mapping(target = "joinedAt", source = "employee.joinedAt", dateFormat = "yyyy-MM-dd HH:mm:ss"),
    })
    EmployeeDTO convertToEmployeeDTO(Employee employee);

    List<EmployeeDTO> convertToEmployeeDTOList(List<Employee> employees);
    List<Employee> convertToEmployeeList(List<EmployeeDTO> employeesDTP);
}
