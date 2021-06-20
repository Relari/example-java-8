package com.pe.relari.example.service;

import com.pe.relari.example.model.Employee;
import com.pe.relari.example.model.Person;
import com.pe.relari.example.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachAndMap {

    private final List<Employee> employees = EmployeeRepository.employees();

    private static void separation() {
        System.out.println("\n--------------------------------------\n");
    }

    private void foreachConvertJava7FirstShape() {
        System.out.println("Foreach en Java 7");

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < employees.size(); i++) {

            Employee employee = employees.get(i);
            people.add(new Person(employee.getId(), employee.getName()));

            System.out.println(employee);
        }

        separation();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }

    private void foreachConvertJava7SecondShape() {
        System.out.println("Foreach en Java 7");

        List<Person> people = new ArrayList<>();

        for (Employee employee : employees) {
            people.add(new Person(employee.getId(), employee.getName()));

            System.out.println(employee);
        }

        separation();

        for (Person person: people) {
            System.out.println(person);
        }
    }

    private void foreachWithStreamAndMap() {

        List<Person> people = employees.stream()
                .map(employee -> {
                    Person person = new Person(employee.getId(), employee.getName());
                    return person;
                }).collect(Collectors.toList());

        people.forEach(System.out::println);
    }

    private void foreachWithStreamAndMapWithBuilder() {
        List<Person> people = employees.stream()
                .map(employee -> new Person(employee.getId(), employee.getName()))
                .collect(Collectors.toList());

        people.forEach(System.out::println);
    }

    private void foreachWithStreamAndMapWithMethod() {
        List<Person> people = employees.stream()
                .map(this::mapPerson)
                .collect(Collectors.toList());

        people.forEach(System.out::println);
    }

    private Person mapPerson(Employee employee) {
        return new Person(employee.getId(), employee.getName());
    }

    public static void main(String[] args) {

        ForEachAndMap forEachAndMap = new ForEachAndMap();

        forEachAndMap.foreachConvertJava7FirstShape();
        separation();

        forEachAndMap.foreachConvertJava7SecondShape();
        separation();

        forEachAndMap.foreachWithStreamAndMap();
        separation();

        forEachAndMap.foreachWithStreamAndMapWithBuilder();
        separation();

        forEachAndMap.foreachWithStreamAndMapWithMethod();
        separation();

    }

}
