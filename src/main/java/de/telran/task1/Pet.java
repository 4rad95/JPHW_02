package de.telran.task1;

public class Pet {
    public String name;
    public int weight;

    public Pet(java.lang.String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eatPet() {
        System.out.println(name + " кушает");
    }
    public  void sleepPet() {
        System.out.println( name + " спит");
    }
}
