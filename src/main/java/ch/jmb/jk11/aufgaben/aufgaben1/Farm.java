package ch.jmb.jkurs1.aufgaben.aufgaben1;

import ch.java_akademie.tools17.allg.MyTools;

public class Farm {

    public static void main(String[] args) {

        MyTools.h1("Farm");

        var heads = MyTools.getInteger("please enter heads > ",
                0, 1000000);

        var prompt = String.format(
                "please enter legs between %d and %d > ",
                heads * 2, heads * 4);
        var legs = 0;
        while (true) {
            legs = MyTools.getInteger(prompt, heads * 2, heads * 4);

            if (!(legs % 2 == 0)) {
                System.out.print("number of legs must be even ... ");
            } else
                break;
        }
        var hens = 0;
        var
                pigs = heads;

        while (!(hens * 2 + pigs * 4 == legs)) {
            hens++;
            pigs--;
        }

        System.out.printf("the farmer has %d hens and %d pigs.%n", hens, pigs);
    }
}
