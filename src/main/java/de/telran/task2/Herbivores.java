package de.telran.task2;

public class Herbivores extends Animal {

    public Herbivores(java.lang.String name, int weight, int age) {
        super(name, weight, age);
    }

    public void makeEat(String name) {
        System.out.println(name + " ест траву ");
    }

}
