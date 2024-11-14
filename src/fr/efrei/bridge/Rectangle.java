package fr.efrei.bridge;
public class Rectangle extends Shape{

    public Rectangle(Color myColor) {
        super(myColor);
    }

    @Override
    public void draw() {
        System.out.println("Je dessine un rectangle de couleur " + myColor.getColor());
    }
}
