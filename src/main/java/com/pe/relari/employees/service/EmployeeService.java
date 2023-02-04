package com.pe.relari.employees.service;

import com.pe.relari.employees.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    void removeEmployee(Integer id);

    void addEmployee(Employee employee);

    Employee searchEmployee(Integer id);

}
