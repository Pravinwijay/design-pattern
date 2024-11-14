package fr.efrei.factorymethod;

public class Launcher {
    public static void main(String[] args) {
        ShapeFactory myShapeFactoryCreator = new ShapeFactoryCreator();
        Shape carre = myShapeFactoryCreator.createShape(ShapeFactoryCreator.ShapeType.SQUARE);
        Shape polygone = myShapeFactoryCreator.createShape(ShapeFactoryCreator.ShapeType.POLYGON);

        System.out.println(carre.getArea());
        System.out.println(polygone.getArea());
    }
}
