package fr.efrei.facade;

public class WashingMachine {

    private int temperature;
    private int speed;
    private int time;

    public void setTemperature(int i) {
        temperature = i;
    }

    public void setSpeed(int i) {
        speed = i;
    }

    public void setTime(int i) {
        time = i;
    }

    public void wash() {
        System.out.println("Je suis entrain de laver le linge");
        System.out.println(this );
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "temperature=" + temperature +
                ", speed=" + speed +
                ", time=" + time +
                '}';
    }
}
