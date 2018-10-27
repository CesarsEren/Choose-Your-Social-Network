/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author cesars
 */
public enum RedesLink {
    FACEBOOK("https://www.facebook.com/"),WHATSAAP("https://web.whatsapp.com/"),GITHUB("https://github.com/"),LINKEDIN("https://www.linkedin.com/feed/"),DISCORD("https://discordapp.com/");
    
    private final String url;

    private RedesLink() {
        this.url = null;
    }

    private RedesLink(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public static RedesLink getFACEBOOK() {
        return FACEBOOK;
    }

    public static RedesLink getDISCORD() {
        return DISCORD;
    }

    public static RedesLink getWHATSAAP() {
        return WHATSAAP;
    }

    public static RedesLink getGITHUB() {
        return GITHUB;
    }

    public static RedesLink getLINKEDIN() {
        return LINKEDIN;
    }
    
}
