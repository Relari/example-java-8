package com.pe.relari.designpattern.singleton;

import com.pe.relari.employees.model.Employee;
import com.pe.relari.employees.service.EmployeeService;
import com.pe.relari.util.EmployeeUtil;
import com.pe.relari.util.PositionCatalog;

public class App {

    public static void main(String[] args) {

        EmployeeService employeeService = EmployeeServiceImpl.getInstance();

        employeeService.getEmployees().forEach(System.out::println);

        employeeService.removeEmployee(2);

        EmployeeUtil.separation();

        Employee employee = Employee.builder()
                .name("Daniel")
                .sex("M")
                .age(20)
                .status(Boolean.TRUE)
                .position(PositionCatalog.DEVELOPER)
                .salary(1200)
                .build();

        employeeService.addEmployee(employee);

        EmployeeService employeeService1 = EmployeeServiceImpl.getInstance();

        employeeService1.getEmployees().forEach(System.out::println);

    }

}
