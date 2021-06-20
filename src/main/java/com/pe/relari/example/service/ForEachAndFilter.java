package com.pe.relari.example.service;

import com.pe.relari.example.model.Employee;
import com.pe.relari.example.repository.EmployeeRepository;

import java.util.List;

public class ForEachAndFilter {

    private final List<Employee> employees = EmployeeRepository.employees();

    private static void separation() {
        System.out.println("\n--------------------------------------\n");
    }

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
        separation();

        forEachAndFilter.foreachAndIfInJava7SecondShape();
        separation();

        forEachAndFilter.foreachAndFilterJava8();
        separation();

        forEachAndFilter.foreachAndFilterJava8Reduced();
        separation();

    }
}
