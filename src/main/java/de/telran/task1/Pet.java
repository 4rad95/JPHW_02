package de.telran.task1;

//
// 1 уровень сложности: 1. У нас в доме живут домашние животные. Попробуйте в этой задаче создать класс Pet
//и записать ему в наследники Cat и Dog. Определите, какие характеристики и поведение ваших питомцев
//общие, а какие проявляются только у конкретного типа.

public class Pet {
    public String name;
    public int weight;
    public  int age;


    public Pet(java.lang.String name, int weight,int age ) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void eatPet() {
        System.out.println(name + " кушает");
    }
    public  void sleepPet() {
        System.out.println( name + " спит");
    }
}
