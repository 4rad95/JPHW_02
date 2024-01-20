package de.telran.task3;

public class Management extends Office{

    boolean leader; //  наличие лидерских качеств

    public Management(java.lang.String name, int age, java.lang.String education, char married, char sex, int children, boolean workPc, boolean leader) {
        super(name, age, education, married, sex, children, workPc);
        this.leader = leader;
    }
}
