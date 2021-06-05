package com.pe.relari.example.model;

//import com.renzo.exercises.lessons.kotlin.model.PersonKt;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

  private Integer id;
  private String name;

}
