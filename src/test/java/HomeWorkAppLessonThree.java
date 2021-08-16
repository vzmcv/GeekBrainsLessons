import java.util.Arrays;

public class HomeWorkAppLessonThree {
    public static void main(String[] args) {

        System.out.println("Task 1: ");
        TaskOne();
        System.out.println("Task 2: ");
        TaskTwo();
        System.out.println("Task 3: ");
        TaskThree();
        System.out.println("\nTask 4: ");
        TaskFour();
        System.out.println("Task 5: ");
        TaskFive(5,1);

    }

        public static void TaskOne() {
            int[] tO = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < tO.length; i++) {
                if (tO[i] == 1) {
                    tO[i] = 0;
                } else tO[i] = 1;
            }
            System.out.println(Arrays.toString(tO));
        }

        public static void TaskTwo() {
            int[] tT = new int[101];
            for (int i = 0; i < tT.length; i++) {
                tT[i] = i;
        }
        System.out.println(Arrays.toString(tT));
        }

        public static void TaskThree() {
            int[] t3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < t3.length; i++) {
                if (t3[i] < 6) {
                    t3[i] = t3[i] * 2;
                }
                System.out.print(t3[i] + " ");
            }
        }

        public static void TaskFour() {
            int[][] tF = new int[5][5];
            for (int i = 0; i < tF.length; i++) {
                tF[i][i] = 1;
                tF[i][tF.length - i - 1] = 1;
                for (int j = 0; j < tF.length; j++) {
                    System.out.print(tF[i][j]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }

        public static void TaskFive(int len, int initialValue) {
            int[] t5 = new int[len];
            for (int i = 0; i < len; i++) {
                t5[i] = initialValue;
                System.out.print("[" + i + "]" + t5[i] + " ");
            }

        }

}

