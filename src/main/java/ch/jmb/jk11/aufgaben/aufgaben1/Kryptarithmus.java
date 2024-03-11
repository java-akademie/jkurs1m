
package ch.jmb.jkurs1.aufgaben.aufgabe1;
import ch.java_akademie.tools17.allg.MyTools;
import java.util.Arrays;

public class Kryptarithmus {

    public static void main(String[] args) {
        MyTools.h1("Kryptarithmus");
        System.out.println("eve/did=.talktalktalk...  periodisch");
        System.out.println();
        for (int e = 0; e <= 9; e++) {
            for (int v = 0; v <= 9; v++) {
                for (int d = 0; d <= 9; d++) {
                    for (int i = 0; i <= 9; i++) {
                        compute(e, v, d, i);
                    }
                }
            }
        }
    }

    private static boolean allAreDifferent(int[] arr) {
        Arrays.sort(arr);
        int z = -1;
        for (int x : arr) {
            if (x == z) {
                return false;
            } else {
                z = x;
            }
        }
        return true;
    }

    static void compute(int e, int v, int d, int i) {
        int eve = e * 100 + v * 10 + e;
        int did = d * 100 + i * 10 + d;

        double erg;

        if (eve > 0 && did > eve) {
            erg = (double) eve / (double) did;
            // 0.1232345654323 -> 1232 & 0.345654323
            erg = erg * 10000;
            int p1 = (int) erg;

            erg = erg - p1;
            // 0.345654323 -> 3456 & 0.54323
            erg = erg * 10000;
            int p2 = (int) erg;

            erg = erg - p2;
            // 0.54323 -> 5432
            erg = erg * 10000;
            int p3 = (int) erg;


            if (p1 == p2 & p2 == p3) // periodisch
            {
                int t, a, l, k;

                t = p1 / 1000;
                p1 = p1 - t * 1000;

                a = p1 / 100;
                p1 = p1 - a * 100;

                l = p1 / 10;
                p1 = p1 - l * 10;

                k = p1;

                int[] x = {e, v, d, i, t, a, l, k};
                if (allAreDifferent(x)) {
                    System.out.println("solution:");
                    System.out.println(eve + "/" + did + "=." + p2);
                }
            }
        }
    }
}
