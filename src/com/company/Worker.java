package com.company;

public class Worker {
    Person person;
    Position position;
    private static double hours;
    private static double hoursWorked = 160;
    private static double hourlyRate = 25;
    Salary salary;
    static  int countWorker;


    public Worker(Person person, Position position, double hours, Salary salary) {
        super ();
        this.person = person;
        this.position = position;
        this.hours = hours;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return person.surname + " " + person.name + " должность: " + position + "; возраст: " + person.age + " лет" + " пол: " + person.sex
                + "; отработано часов: " + hours + ", зарплата составила: " + salary.salary + " рублей";
    }

    public void print() {
        countWorker++;
        System.out.println ("\n" + countWorker + ". " + person.surname + " " + person.name + " " + "" + position.СПЕЦИАЛИСТ);

    }

    public static double getHours() {
        return hours;
    }

    public static double getHoursWorked() {
        return hoursWorked;
    }

    public static double getHourlyRate() {
        return hourlyRate;
    }

    public void add() {
        System.out.println ("Принять на работу");
    }
    public void remove() {
        System.out.println ("Уволить");
    }
}

