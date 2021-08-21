import java.util.Random;
import java.util.Scanner;

public class HomeWorkAppLessonFour {
    private static Scanner scanner;
    private static Random random;
    private static char [][] map;

    private static final int SIZE = 3;

    private static final char MAP_ELEMENT_EMPTY  = '_';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_0 = '0';


    public static void main(String[] args){
        scanner = new Scanner(System.in);
        random = new Random();

        initMap();
        System.out.println("Игра началась - поле чистое");
        printMAP();

        while (true){

            playerTurn();
            printMAP();
            if (checkWin(MAP_ELEMENT_X)){
                System.out.println("Вы победили!");
                break;
            }
            if(isMapFull()){
                System.out.println("Игра окончена! Ничья");
                break;
            }
            botTurn();
            printMAP();
            if (checkWin(MAP_ELEMENT_0)){
                System.out.println("Победил бот!");
                break;
            }
            if(isMapFull()){
                System.out.println("Игра окончена! Ничья");
                break;
            }
        }
    }

    public static boolean checkLine(int start_x, int start_y, int dx, int dy, char element) {
        for (int i = 0; i < SIZE; i++) { // если изменить условие на SIZE-1 выполняется условие 3*
            if (map[start_x + i * dx][start_y + i * dy] != element)
                return false;
        }
        return true;
    }

    public static boolean checkWin(char element) {

        for (int i = 0; i < SIZE; i++) { // если изменить условие на SIZE-1 выполняется условие 3*
            // проверяем строки
            if (checkLine(i, 0, 0, 1, element)) return true;
            // проверяем столбцы
            if (checkLine(0, i, 1, 0, element)) return true;
        }
        // проверяем диагонали
            if (checkLine(0, 0, 1, 1, element)) return true;
            if (checkLine(0, SIZE - 1, 1, -2, element)) return true; // если изменить условие на SIZE-2 выполняется условие 3*
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == MAP_ELEMENT_EMPTY){
                    return false;
                }
            }
        } return true;
    }

    public static void playerTurn(){
        int x,y;

        do {System.out.println("Ваш ход (X,Y)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isMoveValid(x,y));

        map[x][y]= MAP_ELEMENT_X;
    }

    public static void botTurn() {
        int x,y;

        for (int i = 0; i < SIZE; i++) {

        }

        do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);

            } while (!isMoveValid(x, y));

            map[x][y] = MAP_ELEMENT_0;
            System.out.println("Бот выполнил ход" +" "+ "X="+(x+1)+" "+"Y="+(y+1)+ "\n" );
        }


    public static boolean isMoveValid(int x, int y){
        if(x<0||y<0||x>=SIZE||y>=SIZE){
            return false;
        }
        if(map[x][y] != MAP_ELEMENT_EMPTY){
            return false;
        }
        return true;
    }
    public static void printMAP(){
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map [i][j] = MAP_ELEMENT_EMPTY;
            }
        }
    }
}
