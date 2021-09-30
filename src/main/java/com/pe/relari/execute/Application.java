package com.pe.relari.execute;

import com.pe.relari.example.repository.EmployeeRepository;
import lombok.extern.java.Log;

@Log
public class Application {

    public static void main(String[] args) {

        var employeeId = 1;
        var employee = EmployeeRepository
                .employees()
                .stream()
                .filter(employeeDomain -> employeeDomain.getId().equals(employeeId))
                .findFirst()
                .orElseThrow(RuntimeException::new);

        log.info(employee.toString());

        var employee2 = employee.mutate()
                .salary(5500)
                .status(false)
                .build();

        log.info(employee2.toString());

    }
}
