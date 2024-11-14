package fr.efrei.state;

public class Phone {
    DischargedState dischargedState = new DischargedState();

    public Phone(DischargedState dischargedState) {
        this.dischargedState = dischargedState;
    }
    public String startCharge(){
        return "";
    };

    public String stopCharge(){
        return "";
    };

}
