package fr.efrei.builder;

public class CarBuilder implements ICarBuilder{

    private Car car = new Car();
    @Override
    public ICarBuilder setModel(String model) {
        car.setModel(model);
        return this;
    }

    @Override
    public ICarBuilder setColor(int color) {
        car.setColor(color);
        return this;
    }

    @Override
    public ICarBuilder setIsElectricEngine(Boolean isElectricEngine) {
        car.setElectricEngine(isElectricEngine);
        return this;
    }

    @Override
    public Car build() {
        return null;
    }
}
