package Lesson5;

public class MainAppLesson5 {
    public static void main(String[] args){

        Employee[] employees = {
        new Employee("Ivanov Ivan Ivanovich", "Zavhoz", "Zi1@mail.ru", 712323123, 100000, 30),
        new Employee("Petrov Sergei Fedorovich", "Director", "Zi2@mail.ru", 712323134, 112345, 40),
        new Employee("Sidorov Fedor Sergeevich", "Voditel", "Zi3@mail.ru", 712323145, 20000, 20),
        new Employee("Kozlov Petr Semenovich", "Remontnik", "Zi4@mail.ru", 712323156, 20000, 50),
        new Employee("Semenov Viktor Petrovich", "Ohranik", "Zi5@mail.ru", 712323167, 5000, 60)
            };

        for (int i = 0; i < 5; i++) {
            if(employees[i].Age>40)
                employees[i].info();
            }
        }
    }

