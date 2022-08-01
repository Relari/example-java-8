package com.pe.relari.execute;

import com.pe.relari.example.model.Employee;
import com.pe.relari.example.repository.EmployeeRepository;
import lombok.extern.java.Log;

@Log
public class Application {

    public static void main(String[] args) {

        Integer employeeId = 1;
        Employee employee = EmployeeRepository
                .employees()
                .stream()
                .filter(employeeDomain -> employeeDomain.getId().equals(employeeId))
                .findFirst()
                .orElseThrow(RuntimeException::new);

        log.info(employee.toString());

        Employee employee2 = employee.mutate()
                .salary(5500)
                .status(false)
                .build();

        log.info(employee2.toString());

    }
}
