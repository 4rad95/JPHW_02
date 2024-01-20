package de.telran.task3;

public class Accounting extends Office {
    boolean work1C; // умение работать в 1С
    boolean workExel; // навыки работы в Excel

    public Accounting(java.lang.String name, int age, java.lang.String education, char married, char sex, int children, boolean workPc, boolean work1C, boolean workExel) {
        super(name, age, education, married, sex, children, workPc);
        this.work1C = work1C;
        this.workExel = workExel;
    }
}
