package model;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("www.youtube.com");
        bannedSites.add("www.facebook.com");
        bannedSites.add("www.reddit.com");
        bannedSites.add("www.instagram.com");
        bannedSites.add("www.vimeo.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            System.out.println("Acesso negado. Tentativa de conexão com site não permitido: " + serverhost);
        } else {
            realInternet.connectTo(serverhost);
        }
    }
}

