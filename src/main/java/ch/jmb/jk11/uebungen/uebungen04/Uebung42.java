package ch.jmb.jk11.uebungen.uebungen04;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung42 {
    public static void main(String[] args) {
        var radius = MyTools.getDouble("radius > ");
        while (radius > 0) {
            double c = 2 * radius * Math.PI;
            double a = radius * radius * Math.PI;
            System.out.printf("radius: %f; c: %f, a: %f %n", radius, c, a);
            radius = MyTools.getInteger("radius, end=0 > ");
        }
    }
}


