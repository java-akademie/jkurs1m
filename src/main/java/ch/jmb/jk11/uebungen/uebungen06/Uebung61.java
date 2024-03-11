package ch.jmb.jk11.uebungen.uebungen.uebungen06;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung61 {
    public static void main(String[] args) {
        MyTools.h1("mult");
        doIt(-5, 7);
        doIt(5, -8);
        doIt(-35, -2);
        doIt(12, 3);
        doIt(1, 20_000_000_000L);
        doIt(0, 20_000_000_000L);
    }

    public static void doIt(long a, long b) {
        long erg = mult(a, b);
        System.out.printf("%,d * %,d = %,d %n", a, b, erg);
    }

    private static long mult(long a, long b) {
        if (a == 0 || b == 0) return 0;

        int vz = 0;

        if (a < 0) {
            a = -a;
            vz++;
        }
        if (b < 0) {
            b = -b;
            vz++;
        }

        if (a < b) {
            long z = a;
            a = b;
            b = z;
        }

        long erg = 0;

        while (b > 0) {
            erg += a;
            b--;
        }

        if (vz == 1)
            return -erg;
        else
            return erg;
    }
}
