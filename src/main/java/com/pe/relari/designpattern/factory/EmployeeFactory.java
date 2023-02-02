package com.pe.relari.designpattern.factory;

import com.pe.relari.employees.service.EmployeeService;

public interface EmployeeFactory {

    EmployeeService getEmployees(String value);

}
