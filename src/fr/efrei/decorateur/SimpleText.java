package fr.efrei.decorateur;

public class SimpleText implements Text{
    private String text;

    public SimpleText(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

//    public String getHtmlText(){
//        return "<p>Ouhouhou</p>";
//    }

}
