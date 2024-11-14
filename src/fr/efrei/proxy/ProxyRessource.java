package fr.efrei.proxy;

public class ProxyRessource implements PrivateRessource{
    @Override
    public String getPassword() {
        if (identifiant != null && identifiant.equals("root")){
            return myRessource.getPassword();
        }
        return null;
    }

    private String identifiant;
    MyRessource myRessource = new MyRessource();

    public ProxyRessource(String identifiant) {
        this.identifiant = identifiant;
        myRessource = new MyRessource();
    }

}
