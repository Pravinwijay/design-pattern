package fr.efrei.builder;

public class Car {
    private String model;
    private int color;
    private boolean isElectricEngine;

    public Car(String model, int color, boolean isElectricEngine) {
        this.model = model;
        this.color = color;
        this.isElectricEngine = isElectricEngine;
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(int color) {
        this.color = color;
    }

    public Car(boolean isElectricEngine) {
        this.isElectricEngine = isElectricEngine;
    }

    public Car() {
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setElectricEngine(boolean electricEngine) {
        isElectricEngine = electricEngine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color=" + color +
                ", isElectricEngine=" + isElectricEngine +
                '}';
    }
}
