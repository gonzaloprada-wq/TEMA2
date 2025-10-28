package EnglishExercise;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		// I create a final double for the price of the system
		final double SYSTEM = 375.99;

		// I creat a final double for the small screen
		final double SMALL_SCREEN = 75.99;

		//another for the large one
		final double LARGE_SCREEN = 99.99;

		//one more for the antivirus
		final double ANTIVIRUS = 65.99;

		//amd tje last one for the printer
		final double PRINTER = 125;

		// I create a char for the screen
		char screen;

		// Another for the extras
		char extras;

		// One more for save the final price
		double priceFinal = 0;

		//and a scanner for save informatiob
		Scanner reader = new Scanner(System.in);

		//i print a message asking for a letter (A or B) to decide wich screen prefer
		System.out.println("The basic system cost: 375,99 $");

		System.out.println("Wich screen you prefeer? ");

		System.out.println("A. 38cm = 75.99 $");
		System.out.println("B. 43cm = 99.99 $");

		// Then i read the char
		screen = reader.next().charAt(0);
		
		//Then i ask for the extras
		System.out.println("EXTRAS ");

		System.out.println("A. Antivirus software = 65.99 $");
		System.out.println("B. Printer = 125 $");
		System.out.println("C. Nothing more, thanks");

		extras = reader.next().charAt(0);
		
		//the i do a switch for the value you asign for any extra or monitor
		switch (screen) {

		//And i put the price in any case
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

		//The same for the next one (antivirus printer or nothing)
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
		
		//the i print the result
		System.out.println("Final price: "+priceFinal);
		//I close the scanner
		reader.close();
	}
}
