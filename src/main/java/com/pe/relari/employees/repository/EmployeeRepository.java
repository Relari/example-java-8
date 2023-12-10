package com.pe.relari.employees.repository;

import com.pe.relari.employees.model.Employee;
import com.pe.relari.employees.model.Person;
import com.pe.relari.util.EmployeeConstant;
import com.pe.relari.util.PositionCatalog;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeRepository {

    public static List<Employee> employees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Daniel", 19, EmployeeConstant.MALE_CODE, PositionCatalog.DEVELOPER, 1809, true));
        employees.add(new Employee(2, "Maria", 33, EmployeeConstant.FEMALE_CODE, PositionCatalog.ARCHITECT, 2403, true));
        employees.add(new Employee(3, "Juan", 20, EmployeeConstant.MALE_CODE, PositionCatalog.SCRUM_MASTER, 3452, false));
        employees.add(new Employee(4, "Esther", 18, EmployeeConstant.FEMALE_CODE, PositionCatalog.DEVELOPER, 3168, false));
        employees.add(new Employee(5, "Luis", 30, EmployeeConstant.MALE_CODE, PositionCatalog.ARCHITECT, 2921, true));
        employees.add(new Employee(6, "Stephany", 25, EmployeeConstant.FEMALE_CODE, PositionCatalog.MANAGER, 3773, false));
        employees.add(new Employee(7, "Lucho", 28, EmployeeConstant.MALE_CODE, PositionCatalog.MANAGER, 3078, false));
        employees.add(new Employee(8, "Talia", 22, EmployeeConstant.FEMALE_CODE, PositionCatalog.ARCHITECT, 2510, true));
        employees.add(new Employee(9, "Alexander", 31, EmployeeConstant.MALE_CODE, PositionCatalog.MANAGER, 3860, true));
        employees.add(new Employee(10, "Lucero", 25, EmployeeConstant.FEMALE_CODE, PositionCatalog.TEAM_LEAD, 3948, false));

        return employees;
    }

    public static List<Person> people() {
        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            people.add(new Person(i, "Person " + i));
        }

        return people;
    }

}
