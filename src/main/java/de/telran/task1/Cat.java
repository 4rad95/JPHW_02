package de.telran.task1;

public class Cat extends Pet {

    public Cat(java.lang.String name, int weight, int age) {
        super(name, weight, age);
    }

    public void makeGolos (String name) {
        System.out.println(name +" мяукает");
    }
    public void  goTree (String name) {
        System.out.println(name + "залез на дерево");
    }

}
