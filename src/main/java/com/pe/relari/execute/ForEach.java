package com.pe.relari.execute;

import com.pe.relari.employees.model.Employee;
import com.pe.relari.employees.repository.EmployeeRepository;
import com.pe.relari.util.EmployeeUtil;

import java.util.List;

public class ForEach {

    private static final List<Employee> employees = EmployeeRepository.employees();

    private static void foreachJava7FirstShape() {
        System.out.println("Foreach en Java 7");

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }

    }

    private static void foreachJava7SecondShape() {
        System.out.println("Foreach en Java 7");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    private static void foreachJava8() {
        System.out.println("Foreach en Java 8");
        employees.forEach(employee -> System.out.println(employee));
    }

    private static void foreachJava8Reduced() {
        System.out.println("Foreach reduced en Java 8");
        employees.forEach(System.out::println);
    }

    public static void main(String[] args) {

        foreachJava7FirstShape();
        EmployeeUtil.separation();

        foreachJava7SecondShape();
        EmployeeUtil.separation();

        foreachJava8();
        EmployeeUtil.separation();

        foreachJava8Reduced();
        EmployeeUtil.separation();

    }
}
