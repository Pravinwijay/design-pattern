package fr.efrei.state;

public class DischargedState implements State{
    @Override
    public String doSomething() {
        return "Déchargé";
    }
}
