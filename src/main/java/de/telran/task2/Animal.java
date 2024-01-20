package de.telran.task2;

//2*. Создать классы и схему наследования для задачи учета животных в зоопарке:
//
//
//
//Как минимум должен быть общий класс Animal с характеристиками и поведением, характерными для всех животных.
//А дальше уже Ваше творчество, в котором вы должны разбить животных на группы и подгруппы.
//

public class Animal {
    String name;
    int weight;
    int age;

    public Animal(java.lang.String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public  void  makeSleep (String name){
        System.out.println(name + " спит");
    }
    public void makeEat(String name) {
        System.out.println(name +" ест ");
    }
}
