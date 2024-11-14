package fr.efrei.command;

public class CouperLeSon implements Command{

    @Override
    public void execute() {
        System.out.println("Je coupe le son");
    }
}
