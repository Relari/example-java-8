package com.pe.relari.designpattern.factory;

import com.pe.relari.designpattern.singleton.EmployeeServiceImpl;
import com.pe.relari.employees.model.Employee;
import com.pe.relari.employees.repository.EmployeeRepository;
import com.pe.relari.employees.service.EmployeeService;
import com.pe.relari.util.EmployeeConstant;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Hola
 * asdas
 * asdasd
 * adfdsfoijsdfo
 * dsfjjaoJSFOIJSDF
 * SPODFPSJFPS
 */

public class EmployeeFemaleService implements EmployeeService {

    private static final List<Employee> employees = EmployeeRepository.employees();

    private static final String CLASS_NAME = EmployeeFemaleService.class.getSimpleName();

    private EmployeeFemaleService() {}

    private static EmployeeFemaleService instance = null;

    public static EmployeeService getInstance() {
        if (instance == null) {
            System.out.println("["+ CLASS_NAME + "] Creando nueva instancia.");
            instance = new EmployeeFemaleService();
        }
        System.out.println("["+ CLASS_NAME + "] Retornando instancia creada.");
        return instance;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees.stream()
                .filter(employee ->
                        employee.getSex().equals(EmployeeConstant.FEMALE_CODE)
                )
                .collect(Collectors.toList());
    }

    @Override
    public void removeEmployee(Integer id) {
        employees.removeIf(employee ->
                employee.getId().equals(id) &&
                employee.getSex().equals(EmployeeConstant.FEMALE_CODE)
        );
    }

    @Override
    public void addEmployee(Employee employee) {
        if (employee.getSex().equals(EmployeeConstant.FEMALE_CODE)) {
            employees.add(employee);
        }
    }

    @Override
    public Employee searchEmployee(Integer id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id)
                        && employee.getSex().equals(EmployeeConstant.FEMALE_CODE)
                )
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee Female Not Found"));
    }
}
