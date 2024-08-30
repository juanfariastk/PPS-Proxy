package model;

public class RealInternet implements Internet {
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Conectando a " + serverhost + " ... OK");
    }
}