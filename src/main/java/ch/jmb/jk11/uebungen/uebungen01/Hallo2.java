package ch.jmb.jk11.uebungen.uebungen01;

import ch.java_akademie.tools17.allg.MyTools;

public class Hallo2 {
    public static void main(String[] args) {
        String name = MyTools.getString
                ("bitte geben Sie Ihren Namen ein > ");
        System.out.println("Hallo " + name);
    }
}