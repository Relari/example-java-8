package com.pe.relari.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

  private Integer id;
  private String name;
  private Integer age;
  private String sex;
  private String position;
  private Integer salary;
  private Boolean status;

  public EmployeeBuilder mutate() {
    return Employee.builder()
            .id(id)
            .name(name)
            .age(age)
            .sex(sex)
            .position(position)
            .salary(salary)
            .status(status);
  }

}
