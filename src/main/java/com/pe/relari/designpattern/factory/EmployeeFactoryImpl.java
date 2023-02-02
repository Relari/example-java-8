package com.pe.relari.designpattern.factory;

import com.pe.relari.employees.service.EmployeeService;
import com.pe.relari.util.EmployeeConstant;

public class EmployeeFactoryImpl implements EmployeeFactory {

    private final EmployeeMaleService employeeMaleService;
    private final EmployeeFemaleService employeeFemaleService;

    public EmployeeFactoryImpl() {
        this.employeeMaleService = new EmployeeMaleService();
        this.employeeFemaleService = new EmployeeFemaleService();
    }

    @Override
    public EmployeeService getEmployees(String value) {
        switch (value) {
            case EmployeeConstant.MALE_CODE:
                return employeeMaleService;
            case EmployeeConstant.FEMALE_CODE:
                return employeeFemaleService;
            default:
                return null;
        }
    }

}
