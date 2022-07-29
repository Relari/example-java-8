package com.pe.relari.example.service;

import com.pe.relari.example.model.Employee;
import com.pe.relari.example.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalService {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeRepository.employees();

        Random random = new Random();
        int value = random.nextInt(employees.size());

        Optional<Employee> employeeOptional = Optional.of(employees.get(value));

        // Muestra el contenido del Optional.
        System.out.println(employeeOptional);

        // Valida si el valor es o no es nulo.
        employeeOptional.ifPresent(System.out::println);

        // Obtenemos el valor del Optional en Employee.
        Employee employee = employeeOptional.get();
        System.out.println(employee);

        // Abstrae el nombre del empleado
        String name = employeeOptional
                .map(Employee::getName)
                .get();
        System.out.println(name);

        Optional<Employee> employeeOptional2 = Optional.ofNullable(null);

        // Muestra el Optional vacio.
        System.out.println(employeeOptional2);

        // Valida si llega nulo de ser el caso ejecuta el orElse
        Employee employee1 = employeeOptional2.orElse(employee);
        System.out.println(employee1);

        // Valida si llega nulo de ser el caso ejecuta el orElseThrow para mostrar el Error
        Employee employee2 = employeeOptional2.orElseThrow(() -> new RuntimeException("No existe el empleado"));
        System.out.println(employee2);

//        // Cuando se trabaja con listas al user el findFirst este se convierte en un Optional
//        Employee employee3 = employees.stream()
//                .filter(employeeObject -> employeeObject.getId().equals(value))
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("No existe el empleado"));
//        System.out.println(employee3);

    }
}
