package fr.efrei.command;

public class AllumerTV implements Command {
    @Override
    public void execute() {
        System.out.println("J'allume la TV");
    }
}