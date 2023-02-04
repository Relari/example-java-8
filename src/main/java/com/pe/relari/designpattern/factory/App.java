package com.pe.relari.designpattern.factory;

import com.pe.relari.employees.service.EmployeeService;
import com.pe.relari.util.EmployeeConstant;
import com.pe.relari.util.EmployeeUtil;

public class App {

    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();

        EmployeeService employeeMaleService = employeeFactory.getEmployees(EmployeeConstant.MALE_CODE);

        employeeMaleService.getEmployees().forEach(System.out::println);

        EmployeeUtil.separation();


        EmployeeService employeeFemaleService = employeeFactory.getEmployees(EmployeeConstant.FEMALE_CODE);

        employeeFemaleService.getEmployees().forEach(System.out::println);


        EmployeeUtil.separation();

        EmployeeService employeeService = employeeFactory.getEmployees("");

        employeeService.getEmployees().forEach(System.out::println);

    }
}
