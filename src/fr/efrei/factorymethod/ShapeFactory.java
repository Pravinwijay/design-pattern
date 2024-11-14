package fr.efrei.factorymethod;

public interface ShapeFactory {
    // createShape()
    Shape createShape(ShapeFactoryCreator.ShapeType shapeType);
}
