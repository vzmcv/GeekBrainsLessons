public class HomeWorkAppLessonTwo {
    public static void main(String[] args) {


        System.out.println(firstMethod(10, 11));

        secondMethod(-10000000);
        System.out.println();

        System.out.println(thirdMethod(-10));

        fourthMethod("Строка",11);

        fifthMethod(4);


    }

    public static boolean firstMethod(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
            return false;
    }

    public static void secondMethod(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean thirdMethod(int number) {
        if (number >= 0) {
            return true;
        }
            return false;
    }

    public static void fourthMethod(String strName, int repeat){
        for(int i = 0; i < repeat; i++ ){
            System.out.println(strName + " " + i);
        }
    }

    public static void fifthMethod(int year){

        if (year%4==0){
            if ((year%100!=0) || (year%400==0)){
                System.out.println("Високосный");
            }else {
                System.out.println("Обычный");
            }
        }
    }
}