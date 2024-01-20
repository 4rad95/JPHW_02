package de.telran.task3;

public class Production extends Employee{

boolean safetyPrecautions; // инструктаж по технике безопасности

    public Production(java.lang.String name, int age, java.lang.String education, char married, char sex, int children, boolean safetyPrecautions) {
        super(name, age, education, married, sex, children);
        this.safetyPrecautions = safetyPrecautions;
    }
}
