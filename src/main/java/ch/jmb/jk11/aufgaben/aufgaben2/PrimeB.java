
package ch.jmb.jkurs1.aufgaben.aufgabe2;

import ch.java_akademie.tools17.allg.MyTools;
import ch.jmb.jkurs1.aufgaben.aufgaben2.Prime;

public class PrimeB {

    public static void main(String[] args) {

        MyTools.h1("Couples of Primes");

        final var MIN = 1_000_000_000;
        final int MAX = MIN + 1_000_000;

        var z1 = 0;
        var z2 = 0;

        var lastPrim = -1;

        for (var x = MIN; x < MAX; x++) {
            if (Prime.isPrim(x)) {
                if (lastPrim + 2 == x) {
                    z1++;

                    System.out.printf("%,d/%,d \t", lastPrim, x);

                    if (z1 % 4 == 0)
                        System.out.println();
                }

                z2++;

                lastPrim = x;
            }
        }

        System.out.println();
        System.out.println();
        System.out.printf
                ("between %,d and %,d there are %,d primes and %,d couples of primes.\n",
                        MIN, MAX, z2, z1);
    }
}

