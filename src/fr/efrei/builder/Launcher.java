package fr.efrei.builder;

public class Launcher {
    public static void main(String[] args) {
        Car mazda = new Car("CX3", 6, false);
        Car alpha = new Car("Quadrifoglio");
        Car tucson = new Car(false);
        Car polo = new Car(6);

        System.out.println(mazda.toString());
        System.out.println(alpha.toString());
        System.out.println(tucson.toString());
        System.out.println(polo.toString());

        ICarBuilder myCarBuilder = new CarBuilder();
        Car myCar = myCarBuilder.setModel("").setColor(1).setIsElectricEngine(true).build();
    }
}
