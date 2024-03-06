package ch.jmb.jk11.uebungen.uebungen04;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung41 {
    public static void main(String[] args) {
        var radius = MyTools.getInteger("radius > ");
        var c = 2 * radius * Math.PI;
        var a = radius * radius * Math.PI;
        System.out.printf
                ("radius: %d; circumference: %f, area: %f %n", radius, c, a);
    }
}

