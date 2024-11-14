package fr.efrei.facade;

public class Launcher {
    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();

        WashingMachineFacade myFacade = new WashingMachineFacade(washingMachine);
        myFacade.washTShirt();
        myFacade.washPull();
    }
}
