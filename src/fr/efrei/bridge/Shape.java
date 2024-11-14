package fr.efrei.bridge;

public abstract class Shape {
    protected Color myColor;

    public Shape(Color myColor) {
        this.myColor = myColor;
    }

    public Color getMyColor() {
        return myColor;
    }

    public abstract void draw();
}
