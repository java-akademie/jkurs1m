package ch.jmb.jk11.uebungen04;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung41 {
    public static void main(String[] args) {
        var radius = MyTools.getInteger("Radius > ");
        var umfang = 2 * radius * Math.PI;
        var flaeche = radius * radius * Math.PI;
        System.out.println("Radius: " + radius + "  Fläche: " + flaeche + "  Umfang: " + umfang);
    }
}
