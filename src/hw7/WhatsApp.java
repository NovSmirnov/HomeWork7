package hw7;

public class WhatsApp extends Application implements Messageble{

    private String userName;

    public WhatsApp(double diskSpace, String os, double requiredRam, String userName) {
        super(diskSpace, os, requiredRam);
        this.userName = userName;
    }
    @Override
    public void startApp() {
        System.out.println("Application WhatsApp was started!");
        isOn = true;
    }
    public void finishApp() {
        System.out.println("Application WhatsApp was finished!");
        isOn = false;
    }
    @Override
    public void installUpdate(double addDskSps, double addRequiredRam) {
        if (isOn) {
            diskSpace += addDskSps;
            requiredRam += addRequiredRam;
            System.out.println("Application WhatsApp was updated!");
        } else {
            System.out.println("To update you need to start WhatsApp");
        }
    }
    @Override
    public void printAppInfo() {
        System.out.println(String.format("Application: WhatsApp, User name: %s, Space on disk: %f, RAM required: %f, OS: %s",
                userName, diskSpace, requiredRam, os));
    }

    @Override
    public void receiveMassage(String message) {
        System.out.println(message);
        System.out.println("");
        System.out.println("The WhatsApp message was received");
    }

    @Override
    public void sendMessage(String message) {
        if (isOn) {
            System.out.println(message);
            System.out.println("");
            System.out.println("The WhatsApp message was sent");
        } else {
            System.out.println("To send message you need to start WhatsApp");
        }
    }
}
