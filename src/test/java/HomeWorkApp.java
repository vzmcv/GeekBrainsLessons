public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

     static void printThreeWords() {

        System.out.println("Orange" +"\n" + "Banana" + "\n" + "Apple" );
    }
     static void checkSumSign() {
        int a = 1;
        int b = 2;
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }
     static void printColor() {

        int value = 3;
        if (value<=0){
            System.out.println("Красный");
            }
        if(value<=100&&value>0){
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }
     static void compareNumbers() {
         int a = 4;
         int b = 5;
         if (a >= b) {
             System.out.println("a >= b");
         } else {
             System.out.println("a < b");

         }
     }
}


