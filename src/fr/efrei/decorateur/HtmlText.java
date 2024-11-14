package fr.efrei.decorateur;

public class HtmlText implements Text{
    private Text myText;

    public HtmlText(Text myText) {

        this.myText = myText;
    }

    @Override
    public String getText() {
        return "<p>"+ myText.getText() + "</p>";
    }
}
