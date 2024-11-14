package fr.efrei.bridge;

public class Circle extends Shape{

    public Circle(Color myColor) {
        super(myColor);
    }

    @Override
    public void draw() {
        System.out.println("Je dessine un cercle de couleur " + myColor.getColor());
    }
}
