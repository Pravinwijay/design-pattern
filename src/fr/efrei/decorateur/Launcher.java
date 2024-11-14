package fr.efrei.decorateur;

public class Launcher {
    public static void main(String[] args) {
        SimpleText simpleText = new SimpleText("Heil Hitler !");
        System.out.println(simpleText.getText());

        HtmlText htmlText = new HtmlText(simpleText);
        System.out.println(htmlText.getText());
        htmlText.getText();
    }
}
