package de.telran.task3;

public class Shop extends Production{

    boolean workHammer; // умение работать с моллоткои
    boolean workDrill; // умение работать с дрелью

    public Shop(java.lang.String name, int age, java.lang.String education, char married, char sex, int children, boolean safetyPrecautions, boolean workHammer, boolean workDrill) {
        super(name, age, education, married, sex, children, safetyPrecautions);
        this.workHammer = workHammer;
        this.workDrill = workDrill;
    }
}
