package ch.jmb.jk11.uebungen.uebungen05;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung51 {
    public static void main(String[] args) {
        MyTools.h2("Eingabe der Werte");
        var a = MyTools.getInteger("w1 > ");
        var b = MyTools.getInteger("w2 > ");

        MyTools.h2("Verarbeitung");
        var op = MyTools.getInteger("op (1=add,2=sub,3=times,4=div) > ", 1, 4);
        if (op == 1) add(a, b);
        else if (op == 2) sub(a, b);
        else if (op == 3) times(a, b);
        else if (op == 4) div(a, b);
    }

    private static void add(int a, int b) {

        System.out.printf("%d + %d = %d %n", a, b, (a + b));
    }

    private static void sub(int a, int b) {
        System.out.printf("%d - %d = %d %n", a, b, (a - b));
    }

    private static void times(int a, int b) {
        System.out.printf("%d * %d = %d %n", a, b, (a * b));
    }

    private static void div(double a, double b) {
        System.out.printf("%f / %f = %f %n", a, b, (a / b));
    }
}
