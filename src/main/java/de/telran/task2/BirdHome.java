package de.telran.task2;

public class BirdHome extends Animal{


    boolean waterLove; // Водоплавающая или нет

    public BirdHome(java.lang.String name, int weight, int age, boolean waterLove) {
        super(name, weight, age);
        this.waterLove = waterLove;
    }

    public void makeWalk (String name) {
        if (waterLove) {
            System.out.println(name + " плавает в пруду");
        }
        else {
            System.out.println(name + " гуляет под забором ");
        }
    }

}
