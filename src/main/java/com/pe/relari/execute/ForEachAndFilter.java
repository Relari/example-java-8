package com.pe.relari.execute;

import com.pe.relari.employees.model.Employee;
import com.pe.relari.employees.repository.EmployeeRepository;
import com.pe.relari.util.EmployeeUtil;

import java.util.List;

public class ForEachAndFilter {

    private static final List<Employee> employees = EmployeeRepository.employees();

    private static void foreachAndIfInJava7FirstShape() {
        System.out.println("Foreach + Conditional en Java 7");

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getStatus()) {
                System.out.println(employees.get(i));
            }
        }
    }

    private static void foreachAndIfInJava7SecondShape() {
        System.out.println("Foreach + Conditional en Java 7");
        for (Employee employee : employees) {
            if (employee.getStatus()) {
                System.out.println(employee);
            }
        }
    }

    private static void foreachAndFilterJava8() {
        System.out.println("Foreach utilized stream en Java 8");
        employees.stream()
                .filter(employee -> employee.getStatus())
                .forEach(employee -> System.out.println(employee));
    }

    private static void foreachAndFilterJava8Reduced() {
        System.out.println("Foreach utilized stream reduced en Java 8");
        employees.stream()
                .filter(Employee::getStatus)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        foreachAndIfInJava7FirstShape();
        EmployeeUtil.separation();

        foreachAndIfInJava7SecondShape();
        EmployeeUtil.separation();

        foreachAndFilterJava8();
        EmployeeUtil.separation();

        foreachAndFilterJava8Reduced();
        EmployeeUtil.separation();

    }
}
