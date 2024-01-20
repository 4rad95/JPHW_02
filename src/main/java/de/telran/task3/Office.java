package de.telran.task3;

public class Office extends Employee{

    boolean workPc; // умение работать с компьютером

    public Office(java.lang.String name, int age, java.lang.String education, char married, char sex, int children, boolean workPc) {
        super(name, age, education, married, sex, children);
        this.workPc = workPc;
    }
}
