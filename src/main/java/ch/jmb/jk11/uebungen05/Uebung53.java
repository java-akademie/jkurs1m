
package ch.jmb.jk11.uebungen05;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung53 {
    public static void main(String[] args) {
        MyTools.h1("Switch additional exercise");
        MyTools.h2("switch1");
        switch1('a');
        switch1('b');
        switch1('c');
        switch1('d');
        switch1('x');
        MyTools.h2("switch2");
        switch2('a');
        switch2('b');
        switch2('c');
        switch2('d');
        switch2('x');
    }

    private static void switch1(char letter) {
        switch (letter) {
            case 'a' -> System.out.println("a");
            case 'b' -> System.out.println(2);
            case 'c' -> System.out.println(3.33);
            case 'd' -> vera("d");
            default -> vera("not a, b, c or d");
        }
    }

    private static void vera(String x) {
        System.out.println(x);
    }

    private static void switch2(char letter) {
        var selectedValue =
                switch (letter) {
                    case 'a' -> "a";
                    case 'b' -> 2;
                    case 'c' -> 3.33;
                    case 'd' -> "This is 'd’";
                    default -> "not a, b, c or d";
                };
        System.out.printf("%-20s %s %n", selectedValue, selectedValue.getClass());
    }
}
