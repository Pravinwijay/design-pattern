package fr.efrei.bridge;

public class Launcher {
    public static void main(String[] args) {
        Rouge red = new Rouge();
        Bleu blue = new Bleu();

        Rectangle rectangle = new Rectangle(red);
        Circle circle = new Circle(blue);

        rectangle.draw();
        circle.draw();
    }
}
