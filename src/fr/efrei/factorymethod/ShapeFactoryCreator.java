package fr.efrei.factorymethod;

public class ShapeFactoryCreator implements ShapeFactory{

    enum ShapeType {
        SQUARE, POLYGON
    }

    @Override
    public Shape createShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType){
            case SQUARE -> shape = new Square();
            case POLYGON -> shape = new Polygon();
        }
        return shape;
    }
}
