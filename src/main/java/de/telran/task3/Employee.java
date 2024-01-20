package de.telran.task3;


//3*. Вы работаете на предприятии, где работает большое количество сотрудников.
//Создайте классы и схему наследования для организационной структуры предприятия:
//Базовый класс - Employee с перечнем характеристик и поведением, которые присутствуют у любого сотрудника.
//А далее все зависит от подразделений где они работают и их функциональных обязанностей.
public class Employee {

    String name;
    int age;
    String education;
    char married;
    char sex;

    int children;

    public Employee(java.lang.String name, int age, java.lang.String education, char married, char sex, int children) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.married = married;
        this.sex = sex;
        this.children = children;
    }
}
