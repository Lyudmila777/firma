package com.company;

public class Salary {
    Position position;
    double salary;
    double hours = Worker.getHours ();
    double hoursWorked = Worker.getHoursWorked ();
    double hourlyRate = Worker.getHourlyRate ();

    public Salary() {
    }


    @Override
    public String toString() {
        return ", зарплата составила: " + salary + " рублей";
    }

    public Double countSalary(Position position, double hours) {
        double bonus = 200;
        double bonus1 = 100;
        double bonus2 = 50;
        double k = 210;
        double k1 = 110;
        double k2 = 60;
        double sum = ((hourlyRate * hours) / hoursWorked);
        switch (position) {

            case ДИРЕКТОР:
                if (hours > 120) {
                    salary = sum + bonus + k;
                    break;
                }
            case МЕНЕДЖЕР:
                if (hours > 110) {
                    salary = sum + bonus1 + k1;
                    break;
                }
            case СПЕЦИАЛИСТ:
                if (hours > 90) {
                    salary = sum + bonus2 + k2;
                    break;
                }
            default: {
                salary = sum;
            }
        }
        return salary;
    }

   }