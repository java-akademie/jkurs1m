
package ch.jmb.jk11.uebungen05;
import ch.java_akademie.tools17.allg.MyTools;

public class Uebung52 {

    public static void main(String[] args) {
        MyTools.h2("Eingabe der Werte");
        int a = MyTools.getInteger("w1 > ");
        int b = MyTools.getInteger("w2 > ");

        MyTools.h2("Verarbeitung");
        int op = MyTools.getInteger("op (1=add,2=sub,3=times,4=div) > ");

        switch (op) {
            case 1:
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                times(a, b);
                break;
            case 4:
                div(a, b);
                break;
        }
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
