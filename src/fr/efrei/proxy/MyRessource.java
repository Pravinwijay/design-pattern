package fr.efrei.proxy;

public class MyRessource implements PrivateRessource{
    @Override
    public String getPassword() {
        return "efrei";
    }
}
