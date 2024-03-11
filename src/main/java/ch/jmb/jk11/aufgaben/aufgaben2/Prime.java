
package ch.jmb.jkurs1.aufgaben.aufgabe2;
public class Prime {

    public static boolean isPrim(int x) {
        if (x < 2) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        var grenze = 1 + (int) Math.pow(x, 0.5);
        for (var i = 2; i < grenze; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

