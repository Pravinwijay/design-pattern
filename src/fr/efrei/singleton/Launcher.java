package fr.efrei.singleton;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    private static final int MAX_LOGS = 3;

    public static void main(String[] args) {
        Logger.getInstance();

        Logger myLogger = new Logger();

        myLogger.setMessage("je log un truc");
        myLogger.display();

        myLogger.setMessage("un autre log");
        myLogger.display();

        Logger myLogger2 = Logger.getInstance();
    }
}
