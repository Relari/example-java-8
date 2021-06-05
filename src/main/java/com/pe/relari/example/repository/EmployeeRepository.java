package com.pe.relari.example.repository;
import com.pe.relari.example.model.Employee;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeRepository {

    public static List<Employee> employees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Daniel", 19, "M", "developer", 1809, true));
        employees.add(new Employee(2, "Maria", 33, "F", "architect", 2403, true));
        employees.add(new Employee(3, "Juan", 20, "M", "scrum-master", 3452, false));
        employees.add(new Employee(4, "Esther", 18, "F", "developer", 3168, false));
        employees.add(new Employee(5, "Luis", 30, "M", "architect", 2921, true));
        employees.add(new Employee(6, "Stephany", 25, "F", "manager", 3773, false));
        employees.add(new Employee(7, "Lucho", 28, "M", "manager", 3078, false));
        employees.add(new Employee(8, "Talia", 22, "F", "architect", 2510, true));
        employees.add(new Employee(9, "Alexander", 31, "M", "manager", 3860, true));
        employees.add(new Employee(10, "Lucero", 25, "F", "team-lead", 3948, false));

        return employees;
    }

}
