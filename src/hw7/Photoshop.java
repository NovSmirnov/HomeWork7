package hw7;

public class Photoshop extends Application implements PicRetouchable{

    private String colorSpace;

    public Photoshop(double diskSpace, String os, double requiredRam, String colorSpace) {
        super(diskSpace, os, requiredRam);
        this.colorSpace = colorSpace;
    }

    @Override
    public void startApp() {
        System.out.println("Application Photoshop was started!");
        isOn = true;
    }
    public void finishApp() {
        System.out.println("Application Photoshop was finished!");
        isOn = false;
    }
    @Override
    public void installUpdate(double addDskSps, double addRequiredRam) {
        if (isOn) {
            diskSpace += addDskSps;
            requiredRam += addRequiredRam;
            System.out.println("Application Photoshop was updated!");
        } else {
            System.out.println("To update you need to start Photoshop");
        }
    }
    @Override
    public void printAppInfo() {
        System.out.println(String.format("Application: Photoshop, Color space: %s, Space on disk: %f, RAM required: %f, OS: %s",
                colorSpace, diskSpace, requiredRam, os));
    }

    @Override
    public void retouchPicture() {
        if (isOn) {
            System.out.println("Retouch photos in Photoshop and enjoy!");
        } else {
            System.out.println("To work in Photoshop you need to start the application");
        }
    }
}
