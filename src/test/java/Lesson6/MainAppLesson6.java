package Lesson6;

import Lesson6.Animals.Animals;
import Lesson6.Animals.Cat;
import Lesson6.Animals.Dog;

public class MainAppLesson6 {
    public static void main(String[] args) {

        Animals [] animals = {
                new Dog("Бобик"),
                new Dog("Шарик"),
                new Dog("Локи"),
                new Cat("Барсик"),
                new Cat("Кошка")

        };
        System.out.println("__________________");
        animals[0].RunningLength(1000);
        animals[0].SwimmingLength(11);
        System.out.println("__________________");
        animals[1].RunningLength(250);
        animals[1].SwimmingLength(5);
        System.out.println("__________________");
        animals[2].RunningLength(10);
        animals[2].SwimmingLength(0);
        System.out.println("__________________");
        animals[3].RunningLength(400);
        animals[3].SwimmingLength(-1);
        System.out.println("__________________");
        animals[4].RunningLength(0);
        animals[4].SwimmingLength(1);
        System.out.println("__________________");
        System.out.println("Всего животных " + animals.length);

    }
}
