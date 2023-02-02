package com.pe.relari.designpattern.factory;

import com.pe.relari.employees.service.EmployeeService;
import com.pe.relari.util.EmployeeConstant;
import com.pe.relari.util.EmployeeUtil;

public class App {

    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();

        EmployeeService employeeService = employeeFactory.getEmployees(EmployeeConstant.MALE_CODE);

        employeeService.getEmployees().forEach(System.out::println);

        EmployeeUtil.separation();


        EmployeeService employeeService2 = employeeFactory.getEmployees(EmployeeConstant.FEMALE_CODE);

        employeeService2.getEmployees().forEach(System.out::println);

    }
}
