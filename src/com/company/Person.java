package com.company;

public class Person {
    String surname;
    String name;
    int age;
    Sex sex;

    public Person(String surname, String name, int age, Sex sex) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {

    }

    @Override
    public String toString() {

        return surname + " " + name + "; возраст: " + age + " лет" + " пол: " + sex;
    }

}

