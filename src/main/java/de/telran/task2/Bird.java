package de.telran.task2;

public class Bird extends  Animal{

    int countWings;
    int countFoot;
    public Bird(java.lang.String name, int weight, int age, int countWings,int countFoot) {
        super(name, weight, age);
        this.countFoot = countFoot;
        this.countWings = countWings;
    }

    public void makeFly(String name) {
        System.out.println( name +" летает");
    }


}
