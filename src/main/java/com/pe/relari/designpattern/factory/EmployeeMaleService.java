package com.pe.relari.designpattern.factory;

import com.pe.relari.employees.model.Employee;
import com.pe.relari.employees.repository.EmployeeRepository;
import com.pe.relari.employees.service.EmployeeService;
import com.pe.relari.util.EmployeeConstant;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMaleService implements EmployeeService {

    private static final List<Employee> employees = EmployeeRepository.employees();

    @Override
    public List<Employee> getEmployees() {
        return employees.stream()
                .filter(employee ->
                        employee.getSex().equals(EmployeeConstant.MALE_CODE)
                )
                .collect(Collectors.toList());
    }

    @Override
    public void removeEmployee(Integer id) {

    }

    @Override
    public void addEmployee(Employee employee) {

    }
}
