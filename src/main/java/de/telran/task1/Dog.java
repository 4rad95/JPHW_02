package de.telran.task1;

public class Dog extends Pet  {
    public Dog(java.lang.String name, int weight, int age) {
        super(name, weight, age);
    }
    public void makeGolos(String name) {
        System.out.println(name + " лает");
    }
    public void goWork(String name){
        System.out.println(name + " пошел охранять");
    }
}
