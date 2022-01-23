package hw7;

public class Lightroom extends Application implements PicRetouchable{
    private String colorSpace;

    public Lightroom(double diskSpace, String os, double requiredRam, String colorSpace) {
        super(diskSpace, os, requiredRam);
        this.colorSpace = colorSpace;
    }

    @Override
    public void startApp() {
        System.out.println("Application Lightroom was started!");
        isOn = true;
    }
    public void finishApp() {
        System.out.println("Application Lightroom was finished!");
        isOn = false;
    }
    @Override
    public void installUpdate(double addDskSps, double addRequiredRam) {
        if (isOn) {
            diskSpace += addDskSps;
            requiredRam += addRequiredRam;
            System.out.println("Application Lightroom was updated!");
        } else {
            System.out.println("To update you need to start Lightroom");
        }
    }
    @Override
    public void printAppInfo() {
        System.out.println(String.format("Application: Lightroom, Color space: %s, Space on disk: %f, RAM required: %f, OS: %s",
                colorSpace, diskSpace, requiredRam, os));
    }

    @Override
    public void retouchPicture() {
        if (isOn) {
            System.out.println("Retouch photos in Lightroom and enjoy!");
        } else {
            System.out.println("To work in Lightroom you need to start the application");
        }
    }
}
