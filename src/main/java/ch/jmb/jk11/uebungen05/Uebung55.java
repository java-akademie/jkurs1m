
package ch.jmb.jk11.uebungen05;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung55 {

    static int op;

    public static void main(String[] args) {
        op = MyTools.getInteger
                ("op (1=add,2=sub,3=times,4=div,0=end) > ", 0, 5);

        while (op != 0) {
            var a = MyTools.getInteger("w1 > ");
            var b = MyTools.getInteger("w2 > ");

            var erg = switch (op) {
                case 1 -> String.format("%d + %d = %d %n", a, b, (a + b));
                case 2 -> String.format("%d - %d = %d %n", a, b, (a - b));
                case 3 -> String.format("%d * %d = %d %n", a, b, (a * b));
                case 4 -> String.format
                        ("%d / %d = %f %n", a, b, ((double) a / (double) b));
                default -> "not allowed op: " + op;
            };
            System.out.println(erg);

            op = MyTools.getInteger
                    ("op (1=add,2=sub,3=times,4=div,0=end) > ", 0, 5);
        }
    }
}
