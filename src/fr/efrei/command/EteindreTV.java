package fr.efrei.command;

public class EteindreTV implements Command{
    @Override
    public void execute() {
        System.out.println("j'éteins la TV");
    }
}
