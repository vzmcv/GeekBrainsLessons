package Lesson6.Animals;

public class Cat extends Animals{
    public Cat (String name){
        this.name = name;
        this.LimitRunning = 200;
        this.LimitSwimming = 0;
    }


    @Override
    public void SwimmingLength(int SwimmingLength) {
        System.out.println("Коты не умеют плавать");
    }
}
