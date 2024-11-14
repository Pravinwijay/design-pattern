package fr.efrei.singleton;

public class Logger {
    private String message;
    private static Logger myLogger;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void display() {
        System.out.printf(message);
    }

    public static Logger getInstance(){
        if(myLogger == null){
            myLogger= new Logger();
        }
        return myLogger;
    }
}
