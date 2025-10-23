package EnglishExercise;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		final double SYSTEM = 375.99;

		final double SMALL_SCREEN = 75.99;

		final double LARGE_SCREEN = 99.99;

		final double ANTIVIRUS = 65.99;

		final double PRINTER = 125;

		char screen;

		char extras;

		double priceFinal = 0;

		Scanner reader = new Scanner(System.in);

		System.out.println("The basic system cost: 375,99 $");

		System.out.println("Wich screen you prefeer? ");

		System.out.println("A. 38cm = 75.99 $");
		System.out.println("B. 43cm = 99.99 $");

		screen = reader.next().charAt(0);

		System.out.println("Wich screen you prefeer? ");

		System.out.println("A. Antivirus software = 65.99 $");
		System.out.println("B. Printer = 125 $");
		System.out.println("C. Nothing more, thanks");

		extras = reader.next().charAt(0);

		switch (screen) {

		case 'a', 'A' -> {
			priceFinal = SYSTEM + SMALL_SCREEN;
		}

		case 'b', 'B' -> {
			priceFinal = SYSTEM + LARGE_SCREEN;
		}

		default -> {
			System.out.println("ERROR");
		}

		}

		switch (extras) {
		case 'a', 'A' -> {
			priceFinal = priceFinal + ANTIVIRUS;
		}
		case 'b', 'B' -> {
			priceFinal = priceFinal + PRINTER;
		}
		case 'c', 'C' -> {
			System.out.println("No extras");
		}
		default -> {
			System.out.println("ERROR");
		}

		}
	}
}
