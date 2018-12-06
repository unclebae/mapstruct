package com.example.mapstruct.demomapstruct.entity.employee;

import lombok.Getter;

@Getter
public enum EmployeeType {

    DEVELOPER("개발자"),
    DESIGNER("디자이너"),
    MARKETER("마케터"),
    PLANNER("기획"),
    ;

    String title;

    EmployeeType(String title) {
        this.title = title;
    }

}
