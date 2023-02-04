package com.pe.relari.designpattern.factory;

import com.pe.relari.designpattern.singleton.EmployeeServiceImpl;
import com.pe.relari.employees.service.EmployeeService;
import com.pe.relari.util.EmployeeConstant;

public class EmployeeFactoryImpl implements EmployeeFactory {

    private final EmployeeService employeeMaleService;
    private final EmployeeService employeeFemaleService;
    private final EmployeeService employeeService;

    public EmployeeFactoryImpl() {
        this.employeeMaleService = EmployeeMaleService.getInstance();
        this.employeeFemaleService = EmployeeFemaleService.getInstance();
        this.employeeService = EmployeeServiceImpl.getInstance();
    }

    @Override
    public EmployeeService getEmployees(String value) {
        switch (value) {
            case EmployeeConstant.MALE_CODE:
                return employeeMaleService;
            case EmployeeConstant.FEMALE_CODE:
                return employeeFemaleService;
            default:
                return employeeService;
        }
    }

}
