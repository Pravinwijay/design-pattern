package fr.efrei.facade;

public class WashingMachineFacade {
    private WashingMachine myWashingMachine;

    public WashingMachineFacade(WashingMachine myWashingMachine) {
        this.myWashingMachine = myWashingMachine;
    }

    public void washTShirt(){
        myWashingMachine.setTemperature(40);
        myWashingMachine.setSpeed(900);
        myWashingMachine.setTime(900);
        myWashingMachine.wash();
    }

    public void washPull(){
        myWashingMachine.setTemperature(20);
        myWashingMachine.setSpeed(300);
        myWashingMachine.setTime(60);
        myWashingMachine.wash();
    }
}
