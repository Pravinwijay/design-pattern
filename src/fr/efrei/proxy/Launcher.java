package fr.efrei.proxy;

public class Launcher {
    public static void main(String[] args) {
        ProxyRessource proxyRessource;

        proxyRessource = new ProxyRessource(null);
        System.out.println("Password for root : " + proxyRessource.getPassword());

        proxyRessource = new ProxyRessource("me");
        System.out.println("Password for null : " + proxyRessource.getPassword());

        proxyRessource = new ProxyRessource("root");
        System.out.println("Password for root : " + proxyRessource.getPassword());
    }
}
