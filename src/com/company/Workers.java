package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class Workers {

    public static void main(String[] args) {
        Person person = new Person ("Иванов", "Сергей", 36, Sex.МУЖ);
        Person person1 = new Person ("Серова", "Анна", 34, Sex.Жен);
        Person person2 = new Person ("Петров", "Дима", 28, Sex.МУЖ);
        Person person3 = new Person ("Круглова", "Дина", 41, Sex.Жен);
        Person person4 = new Person ("Ветров", "Саша", 53, Sex.МУЖ);
        Person person5 = new Person ("Ливанов", "Артур", 48, Sex.МУЖ);
        Person person6 = new Person ("Власова", "Надя", 24, Sex.Жен);
        Person person7 = new Person ("Смирнов", "Вася", 44, Sex.МУЖ);
        Person person8 = new Person ("Шилин", "Стас", 49, Sex.МУЖ);
        ArrayList<Person> persons = new ArrayList<> ();
        persons.add (person);
        persons.add (person1);
        persons.add (person2);
        persons.add (person3);
        persons.remove (person4);
        persons.add (person5);
        persons.add (person6);
        persons.remove (person7);
        persons.add (person8);
        System.out.println ("Количество работников составило: " + persons.size () + " человек");
        System.out.println ("СПИСОК ДЛЯ ОТДЕЛА КАДРОВ: " + "\n" + persons);

        Salary salary = new Salary ();
        Salary salary1 = new Salary ();
        Salary salary2 = new Salary ();
        Salary salary3 = new Salary ();
        Salary salary4 = new Salary ();
        Salary salary5 = new Salary ();
        Salary salary6 = new Salary ();
        Salary salary7 = new Salary ();
        Salary salary8 = new Salary ();
        System.out.println (salary.countSalary (Position.СПЕЦИАЛИСТ, 122));
        System.out.println (salary1.countSalary (Position.СПЕЦИАЛИСТ, 138));
        System.out.println (salary2.countSalary (Position.МЕНЕДЖЕР, 140));
        System.out.println (salary3.countSalary (Position.СПЕЦИАЛИСТ, 140));
        System.out.println (salary4.countSalary (Position.СПЕЦИАЛИСТ, 115));
        System.out.println (salary5.countSalary (Position.СПЕЦИАЛИСТ, 156));
        System.out.println (salary6.countSalary (Position.МЕНЕДЖЕР, 160));
        System.out.println (salary7.countSalary (Position.СПЕЦИАЛИСТ, 160));
        System.out.println (salary8.countSalary (Position.СПЕЦИАЛИСТ, 160));
        Worker w = new Worker (person, Position.СПЕЦИАЛИСТ, 122, salary);
        Worker w1 = new Worker (person1, Position.СПЕЦИАЛИСТ, 138, salary1);
        Worker w2 = new Worker (person2, Position.МЕНЕДЖЕР, 140, salary2);
        Worker w3 = new Worker (person3, Position.СПЕЦИАЛИСТ, 140, salary3);
        Worker w4 = new Worker (person4, Position.СПЕЦИАЛИСТ, 115, salary4);
        Worker w5 = new Worker (person5, Position.СПЕЦИАЛИСТ, 156, salary5);
        Worker w6 = new Worker (person6, Position.МЕНЕДЖЕР, 160, salary6);
        Worker w7 = new Worker (person7, Position.СПЕЦИАЛИСТ, 160, salary7);
        Worker w8 = new Worker (person8, Position.ДИРЕКТОР, 160, salary8);

        ArrayList<Worker> workers = new ArrayList<> ();
        workers.add (w);
        workers.add (w1);
        workers.add (w2);
        workers.add (w3);
        workers.remove (w4);
        workers.add (w5);
        workers.add (w6);
        workers.remove (w7);
        workers.add (w8);
        System.out.println ("СПИСОК ДЛЯ БУХГАЛТЕРИИ: " + "\n" + workers);


    }
}

