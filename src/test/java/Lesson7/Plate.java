package Lesson7;

public class Plate {

    private int food;
    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int checkFood = food - n;
        if (checkFood < 0)  return false;

//        if (checkFood <= 0){ //вызов метода добавление еды в миску
//            addFood(15);
//        }

        food -= n;
        return true;
    }

    void addFood(int food) { // метод добавления еды
        this.food += food;
    }

    public void info() {
        System.out.println("В миске: " + food + " грамм еды");
        System.out.println("_______________________________");
    }


}
