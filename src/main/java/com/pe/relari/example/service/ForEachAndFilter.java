package com.pe.relari.example.service;

import com.pe.relari.example.model.Employee;
import com.pe.relari.example.repository.EmployeeRepository;
import com.pe.relari.example.util.EmployeeUtil;

import java.util.List;

public class ForEachAndFilter {

    private final List<Employee> employees = EmployeeRepository.employees();

    private void foreachAndIfInJava7FirstShape() {
        System.out.println("Foreach + Conditional en Java 7");

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getStatus()) {
                System.out.println(employees.get(i));
            }
        }
    }

    private void foreachAndIfInJava7SecondShape() {
        System.out.println("Foreach + Conditional en Java 7");
        for (Employee employee : employees) {
            if (employee.getStatus()) {
                System.out.println(employee);
            }
        }
    }

    private void foreachAndFilterJava8() {
        System.out.println("Foreach utilized stream en Java 8");
        employees.stream()
                .filter(employee -> employee.getStatus())
                .forEach(employee -> System.out.println(employee));
    }

    private void foreachAndFilterJava8Reduced() {
        System.out.println("Foreach utilized stream reduced en Java 8");
        employees.stream()
                .filter(Employee::getStatus)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        ForEachAndFilter forEachAndFilter = new ForEachAndFilter();

        forEachAndFilter.foreachAndIfInJava7FirstShape();
        EmployeeUtil.separation();

        forEachAndFilter.foreachAndIfInJava7SecondShape();
        EmployeeUtil.separation();

        forEachAndFilter.foreachAndFilterJava8();
        EmployeeUtil.separation();

        forEachAndFilter.foreachAndFilterJava8Reduced();
        EmployeeUtil.separation();

    }
}
