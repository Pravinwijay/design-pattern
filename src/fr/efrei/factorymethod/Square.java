package fr.efrei.factorymethod;

public class Square implements Shape{
    @Override
    public String getArea() {
        return "Je calcule la surface de mon carré";
    }
}