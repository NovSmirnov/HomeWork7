package hw7;

public abstract class Application {

    protected double diskSpace;
    protected String os;
    protected double requiredRam;
    protected boolean isOn = false;

    public Application(double diskSpace, String os, double requiredRam) {
        this.diskSpace = diskSpace;
        this.os = os;
        this.requiredRam = requiredRam;
    }

    public abstract void startApp();
    public abstract void finishApp();
    public abstract void installUpdate(double addDskSps, double addRequiredRam);
    public abstract void printAppInfo();

}
