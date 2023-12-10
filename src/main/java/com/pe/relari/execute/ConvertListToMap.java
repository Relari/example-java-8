package com.pe.relari.execute;

import com.pe.relari.employees.model.Person;
import com.pe.relari.employees.repository.EmployeeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

    public static void main(String[] args) {

        List<Person> people = EmployeeRepository.people();

//        Map<Integer, Person> personMap = new HashMap<>();
//        people.forEach(person -> personMap.put(person.getId(), person));


        long tiempoInicio = System.currentTimeMillis();

        List<Person> people2 = people.stream()
                .filter(employee -> employee.getId() == 500)
                .collect(Collectors.toList());

        System.out.println(people2);

        long tiempoFin = System.currentTimeMillis();

        long tiempoTotal = tiempoFin - tiempoInicio;

        System.out.println("Tiempo total de ejecución con List: " + tiempoTotal + " milisegundos");

        System.out.println("----------------------------------------------------------------------");

        // Convierte una lista en un map
        Map<Integer, Person> data = people.stream()
                .collect(Collectors.toMap(Person::getId, person -> person));

        long tiempoInicio2 = System.currentTimeMillis();

        System.out.println(data.get(500));

        long tiempoFin2 = System.currentTimeMillis();

        long tiempoTotal2 = tiempoFin2 - tiempoInicio2;

        System.out.println("Tiempo total de ejecución con Map: " + tiempoTotal2 + " milisegundos");

    }

}
