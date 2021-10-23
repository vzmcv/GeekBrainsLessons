package Lesson6.Animals;

public class Animals {

    protected String name;
    protected int LimitRunning;
    protected int LimitSwimming;

    public void RunningLength(int RunningLength) {
        if (RunningLength <= LimitRunning && RunningLength > 0) {
            System.out.println(name + " пробежал " + RunningLength + " метров");
        }
        if (RunningLength <= 0) {
            System.out.println(name + " не побежал");
        }
        if (RunningLength > LimitRunning){
            System.out.println(name + " пробежал только " + LimitRunning + " метров");
        }
    }

    public void SwimmingLength(int SwimmingLength){
        if (SwimmingLength <= LimitSwimming && SwimmingLength > 0) {
            System.out.println(name + " проплыл " + SwimmingLength + " метров");
        }
        if (SwimmingLength <= 0) {
            System.out.println(name + " не поплыл");
        }
        if (SwimmingLength > LimitSwimming) {
            System.out.println(name + " проплыл только " + LimitSwimming + " метров");
        }
    }

}
