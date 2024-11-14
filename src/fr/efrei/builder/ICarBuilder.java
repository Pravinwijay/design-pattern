package fr.efrei.builder;

public interface ICarBuilder {
    ICarBuilder setModel(String model);
    ICarBuilder setColor(int color);
    ICarBuilder setIsElectricEngine(Boolean isElectricEngine);
    Car build();
}
