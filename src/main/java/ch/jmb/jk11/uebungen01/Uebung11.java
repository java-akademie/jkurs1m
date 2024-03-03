package ch.jmb.jk11.uebungen01;

import ch.java_akademie.tools17.allg.MyTools;

public class Uebung11 {

	public static void main(String[] args) {
		double a = MyTools.getDouble("bitte Zahl 1 eingeben  > ");
		double b = MyTools.getDouble("bitte Zahl 2 eingeben  > ");
		System.out.println(a + " " + b);

		var summe = a + b;
		var diff = a - b;
		var prod = a * b;
		var quot = a / b;
		System.out.println("Summe: " + summe);
		System.out.println("Diff : " + diff);
		System.out.println("Prod : " + prod);
		System.out.println("Quot : " + quot);
	}
}
