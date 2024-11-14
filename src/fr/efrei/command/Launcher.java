package fr.efrei.command;

public class Launcher {
    public static void main(String[] args) {
        Command allumer = new AllumerTV();
        Command eteindre = new EteindreTV();
        Command couperLeSon = new CouperLeSon();

        Tv tv = new Tv();
        tv.doAction(eteindre);
        tv.doAction(allumer);
        tv.doAction(couperLeSon);
    }
}
