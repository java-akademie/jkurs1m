
package ch.jmb.jk11.uebungen05;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung54 {

    static int op;

    public static void main(String[] args) {
        op = MyTools.getInteger
                ("op (1=add,2=sub,3=times,4=div,0=end) > ", 0, 4);

        while (op != 0) {
            var a = MyTools.getInteger("w1 > ");
            var b = MyTools.getInteger("w2 > ");

            switch (op) {
                case 1 -> add(a, b);
                case 2 -> sub(a, b);
                case 3 -> times(a, b);
                case 4 -> div(a, b);
            }

            op = MyTools.getInteger
                    ("op (1=add,2=sub,3=times,4=div,0=end) > ", 0, 4);
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
