package ch.jmb.jk11.uebungen03;
import ch.java_akademie.tools17.allg.MyTools;
public class Uebung33 {
    public static void main(String[] args) {
        var start =MyTools.getInteger("Start  > ");
        var stop  =MyTools.getInteger("Stop   > ");
        var teiler=MyTools.getInteger("Teiler > ");

        for (var i = start; i <= stop; i++) {
            if (i % teiler == 0)
                System.out.print(i + " ");
        }
    }
}
