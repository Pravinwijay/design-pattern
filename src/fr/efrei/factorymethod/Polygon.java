package fr.efrei.factorymethod;

public class Polygon implements Shape{
    @Override
    public String getArea() {
        return "Je calcule la surface de mon polygone";
    }
}
