package hw7;

public class Main {
    public static void main(String[] args) {
        Telegram telegram = new Telegram(65, "Android", 35, "Peter");
        WhatsApp whatsApp = new WhatsApp(82, "IOS", 48, "Ivan");
        CallOfDuty callOfDuty = new CallOfDuty(2560, "Windows", 3000, 3);
        Warcraft warcraft = new Warcraft(1940, "Windows", 2360, 5);
        Photoshop photoshop = new Photoshop(1290, "Windows", 3575, "CMYK");
        Lightroom lightroom = new Lightroom(680, "Android", 1200, "RGB");


        Application[] applications = {telegram, whatsApp, callOfDuty, warcraft, photoshop, lightroom};

        for (Application app : applications) {
            if ((app instanceof Messageble) || (app instanceof PicRetouchable) ) {
                app.startApp();
            }
        }

        System.out.println(" ");

        for (Application app : applications) {
            app.installUpdate(33, 78);
        }

        System.out.println(" ");

        for (Application app : applications) {
            app.printAppInfo();
        }

        System.out.println(" ");

        for (Application app : applications) {
            if ((app instanceof Messageble) || (app instanceof PicRetouchable) ) {
                app.finishApp();
            } else {
                app.startApp();
            }
        }

        System.out.println(" ");

        for (Application app : applications) {
            if (app instanceof Playable ) {
                ((Playable) app).playGame();
            }
        }
    }
}

