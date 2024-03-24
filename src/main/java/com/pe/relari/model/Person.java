package com.pe.relari.model;

import com.pe.relari.util.GenderCatalog;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {

  private final Integer id;
  private final String name;
  private final GenderCatalog gender;

  public Person(Integer id, String name, GenderCatalog gender) {
    this.id = id;
    this.name = name;
    this.gender = gender;
  }

  public Person(Employee employee) {
    this.id = employee.getId();
    this.name = employee.getName();
    this.gender = employee.getSex();
  }

}
