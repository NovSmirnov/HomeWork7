package hw7;

public class CallOfDuty extends Application implements Playable{

    private int levelOfDifficulty;

    public CallOfDuty(double diskSpace, String os, double requiredRam, int levelOfDifficulty) {
        super(diskSpace, os, requiredRam);
        this.levelOfDifficulty = levelOfDifficulty;
    }

    @Override
    public void startApp() {
        System.out.println("Application CallOfDuty was started!");
        isOn = true;
    }
    public void finishApp() {
        System.out.println("Application CallOfDuty was finished!");
        isOn = false;
    }
    @Override
    public void installUpdate(double addDskSps, double addRequiredRam) {
        if (isOn) {
            diskSpace += addDskSps;
            requiredRam += addRequiredRam;
            System.out.println("Application CallOfDuty was updated!");
        } else {
            System.out.println("To update you need to start CallOfDuty");
        }
    }
    @Override
    public void printAppInfo() {
        System.out.println(String.format("Application: Call of duty, Level of difficulty: %d, Space on disk: %f, RAM required: %f, OS: %s",
                levelOfDifficulty, diskSpace, requiredRam, os));
    }

    @Override
    public void playGame() {
        if (isOn) {
            System.out.println("Play Call of duty and enjoy!");
        } else {
            System.out.println("To play Call of duty you need to start the game");
        }
    }
}
