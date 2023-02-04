package com.pe.relari.designpattern.singleton;

import com.pe.relari.designpattern.factory.EmployeeMaleService;
import com.pe.relari.employees.model.Employee;
import com.pe.relari.employees.repository.EmployeeRepository;
import com.pe.relari.employees.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private static final List<Employee> employees = EmployeeRepository.employees();

    private static final String CLASS_NAME = EmployeeServiceImpl.class.getSimpleName();

    private EmployeeServiceImpl() {}

    private static EmployeeService instance = null;

    public static EmployeeService getInstance() {
        if (instance == null) {
            System.out.println("["+ CLASS_NAME + "] Creando nueva instancia.");
            instance = new EmployeeServiceImpl();
        }
        System.out.println("["+ CLASS_NAME + "] Retornando instancia creada.");
        return instance;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void removeEmployee(Integer id) {
        System.out.println("Eliminando el empleado con el ID = " + id);
        employees.removeIf(employee -> employee.getId().equals(id));
    }

    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Agregado al nuevo empleado.");
        employees.add(employee);
    }

    @Override
    public Employee searchEmployee(Integer id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee Not Found"));
    }
}
