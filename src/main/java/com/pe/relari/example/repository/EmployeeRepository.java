package com.pe.relari.example.repository;
import com.pe.relari.example.model.Employee;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeRepository {
    
    private static final String DEVELOPER_VALUE = "developer";
    private static final String MANAGER_VALUE = "manager";
    private static final String ARCHITECT_VALUE = "architect";
    private static final String SCRUM_MASTER_VALUE = "scrum-master";
    private static final String TEAM_LEAD_VALUE = "team-lead";

    private static final String MALE_CODE = "M";
    private static final String FEMALE_CODE = "F";

    public static List<Employee> employees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Daniel", 19, MALE_CODE, DEVELOPER_VALUE, 1809, true));
        employees.add(new Employee(2, "Maria", 33, FEMALE_CODE, ARCHITECT_VALUE, 2403, true));
        employees.add(new Employee(3, "Juan", 20, MALE_CODE, SCRUM_MASTER_VALUE, 3452, false));
        employees.add(new Employee(4, "Esther", 18, FEMALE_CODE, DEVELOPER_VALUE, 3168, false));
        employees.add(new Employee(5, "Luis", 30, MALE_CODE, ARCHITECT_VALUE, 2921, true));
        employees.add(new Employee(6, "Stephany", 25, FEMALE_CODE, MANAGER_VALUE, 3773, false));
        employees.add(new Employee(7, "Lucho", 28, MALE_CODE, MANAGER_VALUE, 3078, false));
        employees.add(new Employee(8, "Talia", 22, FEMALE_CODE, ARCHITECT_VALUE, 2510, true));
        employees.add(new Employee(9, "Alexander", 31, MALE_CODE, MANAGER_VALUE, 3860, true));
        employees.add(new Employee(10, "Lucero", 25, FEMALE_CODE, TEAM_LEAD_VALUE, 3948, false));

        return employees;
    }

}
