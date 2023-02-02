package com.pe.relari.designpattern.singleton;

import com.pe.relari.employees.service.EmployeeService;
import com.pe.relari.util.EmployeeUtil;

public class App {

    public static void main(String[] args) {

        EmployeeService employeeService = EmployeeServiceImpl.getInstance();

        employeeService.getEmployees().forEach(System.out::println);

        employeeService.removeEmployee(2);

        EmployeeUtil.separation();

        EmployeeService employeeService1 = EmployeeServiceImpl.getInstance();

        employeeService1.getEmployees().forEach(System.out::println);

    }

}
