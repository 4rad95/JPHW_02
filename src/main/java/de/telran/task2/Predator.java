package de.telran.task2;

public class Predator extends  Animal{

    public Predator(java.lang.String name, int weight, int age) {
        super(name, weight, age);
    }

    public void makeHunting (String name){
        System.out.println( name + "охотится" );
    }

}
