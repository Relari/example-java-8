package com.pe.relari.execute;

@FunctionalInterface
public interface OperationInterface {

    Integer sumOfTwoValues(int firstNumber, int secondNumber);

    default String message(String name) {
        return "Hello ".concat(name);
    }

    default String messageDefault() {
        return "Hello World";
    }
}
