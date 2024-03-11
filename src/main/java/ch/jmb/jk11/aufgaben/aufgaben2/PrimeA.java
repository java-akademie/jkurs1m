
package ch.jmb.jkurs1.aufgaben.aufgaben2;
import ch.java_akademie.tools17.allg.MyTools;
import ch.jmb.jkurs1.aufgaben.aufgaben2.Prime;

public class PrimeA {

    public static void main(String[] args) {

        MyTools.h1("Primes");

        final var MIN = 1999000000;
        final var MAX = 2000000000;
        var z1 = 0;

        for (var x = MIN; x < MAX; x++) {
            if (Prime.isPrim(x)) {
                // System.out.println(x + "  ");
                z1++;
            }
        }

        System.out.printf("between %,d and %,d there are %d Primes. %n",
                MIN, MAX, z1);
    }

}
